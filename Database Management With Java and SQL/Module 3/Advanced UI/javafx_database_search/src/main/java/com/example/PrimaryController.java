package com.example;


import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.beans.Observable;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class PrimaryController {

    @FXML
    private TextField searchField;


    @FXML
    private TableColumn<City, Integer> idColumn;
    @FXML
    private TableColumn<City, String> cityNameColumn;
    @FXML
    private TableColumn<City, String> countryCodeColumn;
    @FXML
    private TableColumn<City, String> disctrictColumn; 
    @FXML
    private TableColumn<City, Integer> populationColumn;

    @FXML
    private TableView<City> tableView;

    @FXML
    public void initialize(){
        idColumn.setCellValueFactory(new PropertyValueFactory<>("cityId"));
        cityNameColumn.setCellValueFactory(new PropertyValueFactory<>("cityName"));
        countryCodeColumn.setCellValueFactory(new PropertyValueFactory<>("countryCode"));
        disctrictColumn.setCellValueFactory(new PropertyValueFactory<>("district"));
        populationColumn.setCellValueFactory(new PropertyValueFactory<>("population"));
    
        tableView.setItems(getAllCities());
    }

    private static Connection connect() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","Thegeneral-1");
        
    }

    private ObservableList<City> getAllCities(){

        ObservableList<City> cityList = FXCollections.observableArrayList();

        String query = "SELECT * FROM city";

        try(Connection conn = connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query)){

                while(rs.next()){
                    int userId = rs.getInt("ID");
                    String cityName = rs.getString("Name");
                    String countryCode = rs.getString("CountryCode");
                    String district = rs.getString("District");
                    int population = rs.getInt("Population");

                    cityList.add(new City(userId, cityName, countryCode, district, population));
                }
            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        //return cityList;

        FilteredList<City> fList = new FilteredList<>(cityList, c -> true);
        fList.predicateProperty().bind(Bindings.createObjectBinding(
            () -> {
                String searchText = searchField.getText();

                //if Field empty
                if(searchText == null || searchText.isEmpty()){
                    return city -> true;
                }

                //Otherwise, filter based on the person/s name
                String lowerCaseFilter = searchText.toLowerCase();
                return city -> city.getCityName().toLowerCase().contains(lowerCaseFilter);
            }
            , searchField.textProperty()
            
            ));

            return fList;

    }



}

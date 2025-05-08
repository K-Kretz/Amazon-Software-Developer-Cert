package com.example;


import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.beans.Observable;
import javafx.beans.binding.Bindings;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class PrimaryController {

    @FXML
    private Button btnDelete;
    @FXML
    private Button btnInsert;
    @FXML
    private Button btnRead;
    @FXML
    private Button btnUpdate;

    @FXML
    private TextField countryCodeField;
    @FXML
    private TextField districtField;
    @FXML
    private TextField nameField;
    @FXML
    private TextField populationField;

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
    
        //tableView.setItems(getAllCities());
        refreshTable();
    }

    private void refreshTable() {
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

        return cityList;

    }

    @FXML
    void deleteCity(ActionEvent event) {
        City selectedCity = tableView.getSelectionModel().getSelectedItem();
        String query = "DELETE FROM city WHERE ID = ?";
        try (Connection con = connect();
        PreparedStatement pst = con.prepareStatement(query)) {
            pst.setInt(1, selectedCity.getCityId());
            pst.executeUpdate();

            refreshTable();
            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    @FXML
    void insetCity(ActionEvent event) {
        System.out.println("insertCity() called");

        String cityName = nameField.getText();
        String countryCode = countryCodeField.getText();
        String district= districtField.getText();
        int population = Integer.valueOf(populationField.getText());

        String query = " INSERT INTO city (Name,CountryCode, District, Population)"+
                       " VALUES (?,?,?,?)";

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "Thegeneral-1");
            PreparedStatement pst = con.prepareStatement(query)) {

                pst.setString(1, cityName);
                pst.setString(2, countryCode);
                pst.setString(3, district);
                pst.setInt(4, population);

                pst.executeUpdate();

                refreshTable();
                
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        
    }

    @FXML
    void readCity(ActionEvent event) {
        City selectedCity = tableView.getSelectionModel().getSelectedItem();
        countryCodeField.setText(selectedCity.getCountryCode());
        districtField.setText(selectedCity.getDistrict());
        nameField.setText(selectedCity.getCityName());
        populationField.setText(String.valueOf(selectedCity.getPopulation()));

    }

    @FXML
    void updateCity(ActionEvent event) {
        
        String cityName = nameField.getText();
        String countryCode = countryCodeField.getText();
        String district = districtField.getText();
        String population = populationField.getText();

        City selectedCity = tableView.getSelectionModel().getSelectedItem();

        String query = " UPDATE city"+
                        " SET Name = ?, CountryCode = ?, District = ?, Population = ?"+
                        " WHERE ID = ?";

        try (Connection con = connect();
            PreparedStatement pst = con.prepareStatement(query)) {

                pst.setString(1, cityName);
                pst.setString(2, countryCode);
                pst.setString(3, district);
                pst.setString(4, population);
                pst.setInt(5, selectedCity.getCityId());

                pst.executeUpdate();
                refreshTable();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }



}

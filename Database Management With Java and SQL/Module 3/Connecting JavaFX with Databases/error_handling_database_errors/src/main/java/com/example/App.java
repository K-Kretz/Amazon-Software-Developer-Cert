package com.example;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


//Packages for error handling display label
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
       
        // TextArea taUser = new TextArea();
        // taUser.setEditable(false);
        // taUser.setMinSize(640, 400);
///////////////////////////////////////////////////////////////////////
        TableView<City> cityTableView = new TableView<>();
        cityTableView.setMinSize(640,400);

        //////////////////////////////////////////////////
        Label errorLabel = new Label(); // Label for displaying error messages
        errorLabel.setTextFill(Color.RED);	// Set the text color to red
        errorLabel.setFont(new Font(16));	// Set the font size to 16
        //////////////////////////////////////////////////

        TableColumn<City, Integer> cityIdColumn = new TableColumn<>("City ID");
        TableColumn<City, String> cityNameColumn = new TableColumn<>("Name");
        TableColumn<City, String> cityCountryCodeColumn = new TableColumn<>("Country Code");
        TableColumn<City, String> cityDistrictColumn = new TableColumn<>("District");
        TableColumn<City, Integer> cityPopulationColumn = new TableColumn<>("Population");

        cityIdColumn.setCellValueFactory(new PropertyValueFactory<>("cityId"));
        cityNameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        cityCountryCodeColumn.setCellValueFactory(new PropertyValueFactory<>("countryCode"));
        cityDistrictColumn.setCellValueFactory(new PropertyValueFactory<>("district"));
        cityPopulationColumn.setCellValueFactory(new PropertyValueFactory<>("population"));

        cityTableView.getColumns().add(cityIdColumn);
        cityTableView.getColumns().add(cityNameColumn);
        cityTableView.getColumns().add(cityCountryCodeColumn);
        cityTableView.getColumns().add(cityDistrictColumn);
        cityTableView.getColumns().add(cityPopulationColumn);
////////////////////////////////////////////////////////////////////////////
        DatabaseHandler dh = new DatabaseHandler();
        // String userData = "";

        //Java fx Observable list that updates itself as data is placed or removed
        ObservableList<City> cityList = null;

        try {
            // userData = dh.getAllUsers();

            //Sett the data that was aquired from the database to the ObservableList
            cityList = dh.getCityAsObserableList();

       } catch (Exception e) {
        e.printStackTrace();
        errorLabel.setText("ERROR Fetching city data: "+ e.getMessage());
       }

    //    taUser.setText(userData);
       //Have the Table view set the items inside with the Observable list
       cityTableView.setItems(cityList);
       
       
       
       //Load the table into the VBox after the text area
    //    VBox vbox = new VBox(taUser,cityTableView);
       VBox vbox = new VBox(errorLabel,cityTableView);
       scene = new Scene(vbox,640,480);
       stage.setTitle("City Listed View");
       stage.setScene(scene);
       stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}
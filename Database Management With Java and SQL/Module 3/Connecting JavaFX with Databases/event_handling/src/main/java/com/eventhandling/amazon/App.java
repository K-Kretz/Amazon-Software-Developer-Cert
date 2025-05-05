package com.eventhandling.amazon;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        //load primary view
        loadPrimaryView();

        //set the scene on the stage and show it
        stage.setScene(scene);
        stage.setTitle("Primary View");
        stage.show();
    }

    //Method to switch between views
    public static void setRoot(String view) throws IOException{
        if(view.toLowerCase().equals("secondary")){
            loadSecondaryView(); //Load view secondary
        } else{
            loadPrimaryView(); //Load view secondary
        }
    }

    private static void loadSecondaryView() {
         // create a label and button for the primary view
         Label secondaryLabel = new Label("This is the Secondary View");

         Button secondaryButton = new Button("Switch to Primary View");
 
         //Set the event handler for the primary button
         secondaryButton.setOnAction(PrimaryEventHandler.getSecondaryButtonHandler());
 
         //create a layout(VBox) and add the label and button
         VBox vbox = new VBox(20); // vertical layout with 20 px spacing
         vbox.getChildren().addAll(secondaryLabel,secondaryButton);
 
         //If scene is null(first run), initialize is with the primary view
         if(scene==null)
         {
             scene = new Scene(vbox,640,480); //create a new scene wit hte vBox
         } else{
             scene.setRoot(vbox); //Just set the new root if the scene already exists
         }
    }

    private static void loadPrimaryView() {
        // create a label and button for the primary view
        Label primaryLabel = new Label("This is the Primary View");

        Button primaryButton = new Button("Switch to Secondary View");

        //Set the event handler for the primary button
        primaryButton.setOnAction(PrimaryEventHandler.getPrimaryButtonHandler());

        //create a layout(VBox) and add the label and button
        VBox vbox = new VBox(20); // vertical layout with 20 px spacing
        vbox.getChildren().addAll(primaryLabel,primaryButton);

        //If scene is null(first run), initialize is with the primary view
        if(scene==null)
        {
            scene = new Scene(vbox,640,480); //create a new scene wit hte vBox
        } else{
            scene.setRoot(vbox); //Just set the new root if the scene already exists
        }

    }

    public static void main(String[] args) {
        launch();
    }

    

}
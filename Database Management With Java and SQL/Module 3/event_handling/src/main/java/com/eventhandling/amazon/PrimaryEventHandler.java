package com.eventhandling.amazon;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class PrimaryEventHandler {

    public static EventHandler<ActionEvent> getPrimaryButtonHandler() {
        return new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
               try {
                App.setRoot("secondary");
               } catch (IOException e) {
                e.printStackTrace();
               }
            }
            
        };
    }

    public static EventHandler<ActionEvent> getSecondaryButtonHandler() {
        return new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
               try {
                App.setRoot("primary");
               } catch (IOException e) {
                e.printStackTrace();
               }
            }
            
        };
    }

}

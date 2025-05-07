package com.example;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private Label nameLabel;

    @FXML
    private TextField nameText;

    private StringProperty textProperty = new SimpleStringProperty();

    @FXML
    public void initialize(){
        textProperty.bindBidirectional(nameText.textProperty());
        nameLabel.textProperty().bind(textProperty);
    }
}

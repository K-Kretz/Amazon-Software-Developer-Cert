package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private Button mainButton;

    @FXML
    private TextField nameText;

    @FXML
    void onBtnClick(ActionEvent event) {
        System.out.println("Hello, "+nameText.getText());
        System.out.println(mainButton.getText()+" Button Clicked");
    }

}

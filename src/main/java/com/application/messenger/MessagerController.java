package com.application.messenger;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MessagerController {
    @FXML
    private VBox chatVbox;

    @FXML
    private TextField chatTextField;

    @FXML
    void sendMassage(MouseEvent event) {
        String s = chatTextField.getText();
        HBox hbox = new HBox();
        hbox.getStyleClass().add("label-right");
        Label label = new Label(s);
        label.getStyleClass().add("border-chat-bubble-right");
        label.getStyleClass().add("label-custom");
        hbox.getChildren().add(label);
        chatVbox.getChildren().add(hbox);
        chatTextField.clear();
    }
}
package com.mmit.controller;

import java.io.IOException;

import com.mmit.Start;
import com.mmit.model.entity.User;
import com.mmit.model.service.DatabaseService;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class LoginController {

	@FXML
    private TextField txt_email;

    @FXML
    private PasswordField txt_password;
    
    public static User login_user;

    @FXML
    void btn_clear_click(ActionEvent event) {
    	txt_email.setText(null);
    	txt_password.setText(null);
    }

    @FXML
    void btn_exist_click(ActionEvent event) {
    	System.exit(0);
    }

    @FXML
    void btn_login_click(ActionEvent event) throws IOException {
    	String email = txt_email.getText();
    	String pass = txt_password.getText();
    	
    	var user = DatabaseService.login(email, pass);
    	if(user != null) { // login success
    		login_user = user;
    		Start.change_scence("view/Main.fxml");
    	}
    	else { // fail
    		Alert alert = new Alert(AlertType.ERROR);
    		alert.setContentText("You are not authenticated");
    		alert.setHeaderText(null);
    		alert.setTitle("Message");
    		alert.showAndWait();
    	}
    }

}

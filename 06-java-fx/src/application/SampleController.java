package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SampleController {
	@FXML
	private TextField txt_name;
	@FXML
	private PasswordField txt_password;
	@FXML
	private Label lbl_result;
	
	@FXML
	public void btn_login_click() {
		String name = txt_name.getText();
		String pass = txt_password.getText();
		
		if(name.isEmpty()) {
			lbl_result.setText("Please enter user name");
			return;
		}
		if(pass.isEmpty()) {
			lbl_result.setText("Please enter password");
			return;
		}
		
		if(name.equals("mmit") && pass.equals("admin")) {
			lbl_result.setText("Login success");
		}
		else {
			lbl_result.setText("Invalid Login");
		}
	}
	
	@FXML
	public void btn_login_clear() {
		txt_name.setText("");
		txt_password.setText(null);
	}
	
	@FXML
	public void lbl_click() throws IOException {
		Main.changeScence("Register.fxml");
	}
}

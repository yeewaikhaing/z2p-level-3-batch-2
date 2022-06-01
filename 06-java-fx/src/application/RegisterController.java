package application;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class RegisterController implements Initializable{

	@FXML
    private ComboBox<String> cbo_city;

    @FXML
    private CheckBox chk_java;

    @FXML
    private CheckBox chk_javascript;

    @FXML
    private CheckBox chk_php;

    @FXML
    private ToggleGroup rad_group;

    @FXML
    private TextArea text_area;

    @FXML
    private DatePicker txt_dob;

    @FXML
    private TextField txt_name;

    @FXML
    private PasswordField txt_pass;

    @FXML
    void btn_login_click(ActionEvent event) throws IOException {
    	Main.changeScence("Sample.fxml");
    }

    @FXML
    void btn_register_click(ActionEvent event) {

    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		List<String> cities = List.of("Yangon", "Mandalay", "Pyin Oo Lwin");
		
		cbo_city.setItems(FXCollections.observableArrayList(cities));
		
	}
}

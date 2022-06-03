package com.mmit;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;


public class Start extends Application {
	
	static Stage orignal_stage;
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("view/Main.fxml"));
			Scene scene = new Scene(root);
			orignal_stage = primaryStage;
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setResizable(false);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void change_scence(String input_file) throws IOException {
		Parent root = FXMLLoader.load(Start.class.getResource(input_file));
		Scene scene = new Scene(root);
		orignal_stage.hide();
		
		orignal_stage.setScene(scene);
		orignal_stage.setResizable(false);
		orignal_stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

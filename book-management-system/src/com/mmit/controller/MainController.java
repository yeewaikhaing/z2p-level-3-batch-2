package com.mmit.controller;

import java.io.IOException;

import com.mmit.Start;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class MainController {
	
	@FXML
    void author_click(MouseEvent event) throws IOException {
		Start.change_scence("view/Authors.fxml");
    }

    @FXML
    void book_click(MouseEvent event) throws IOException {
    	Start.change_scence("view/Books.fxml");
    }

    @FXML
    void category_click(MouseEvent event) throws IOException {
    	Start.change_scence("view/Categories.fxml");
    }
}

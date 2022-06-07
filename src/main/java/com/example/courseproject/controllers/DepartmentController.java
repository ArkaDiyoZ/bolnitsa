package com.example.courseproject.controllers;

import com.example.courseproject.Main;
import com.example.courseproject.sql.Inserts;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class DepartmentController {

    @FXML
    private Button departmentAddButton;

    @FXML
    private TextField departmentName;

    @FXML
    private Label error;

    @FXML
    private Button fromDepartAddtoMenuButton;

    @FXML
    void buttonAddDepartment(ActionEvent event) {
        Inserts.newDepartmentInsert(departmentName.getText());
    }

    @FXML
    void fromDepartAddtoMenu(ActionEvent event)throws IOException {
        Main main = new Main();
        main.changeScene("main.fxml");
    }

}

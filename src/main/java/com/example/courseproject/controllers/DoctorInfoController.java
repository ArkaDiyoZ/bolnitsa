package com.example.courseproject.controllers;

import com.example.courseproject.Main;
import com.example.courseproject.another.MessageBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class DoctorInfoController {

    @FXML
    private Button SearchDocInfoButton;

    @FXML
    private TextField doctorAge;

    @FXML
    private TextField doctorDepartment;

    @FXML
    private TextField doctorName;

    @FXML
    private TextField doctorPost;

    @FXML
    private TextField doctorSalary;

    @FXML
    private TextField doctorSureName;

    @FXML
    private Label error;

    @FXML
    private Button fromDocInfoToMenuButton;

    @FXML
    void SearchDocInfo(ActionEvent event) {
        MessageBox.messageBoxError("Врач не был найден в базе данных !");
    }

    @FXML
    void fromDocInfoToMenu(ActionEvent event) throws IOException {
        Main main = new Main();
        main.changeScene("actionPage.fxml");
    }

}

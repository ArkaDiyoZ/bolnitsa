package com.example.courseproject.controllers;

import com.example.courseproject.sql.Inserts;
import com.example.courseproject.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class DoctorController {

    @FXML
    private Button doctorAddButton;

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
    void buttonAddDoctor(ActionEvent event) {

        Inserts.newDoctorInsert(doctorName.getText(), doctorSureName.getText(), Integer.parseInt(doctorDepartment.getText()),
                                            doctorPost.getText(),Double.parseDouble(doctorSalary.getText()),Integer.parseInt(doctorAge.getText()));
    }

    @FXML
    void fromDocAddtoMenu(ActionEvent event) throws IOException {
        Main main = new Main();
        main.changeScene("main.fxml");
    }

}

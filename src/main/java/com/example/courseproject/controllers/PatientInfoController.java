package com.example.courseproject.controllers;

import com.example.courseproject.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class PatientInfoController {

    @FXML
    private Button SearchPatientInfoButton;

    @FXML
    private Button fromPatientInfoToMenuButton;

    @FXML
    private TextField patientAge;

    @FXML
    private TextField patientDepartId;

    @FXML
    private TextField patientDiagnosId;

    @FXML
    private TextField patientName;

    @FXML
    private TextField patientSurname;

    @FXML
    void SearchPatientInfo(ActionEvent event) {

    }

    @FXML
    void fromPatientInfoToMenu(ActionEvent event) throws IOException {
        Main main = new Main();
        main.changeScene("actionPage.fxml");
    }

}

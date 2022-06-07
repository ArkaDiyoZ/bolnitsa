package com.example.courseproject.controllers;

import com.example.courseproject.Main;
import com.example.courseproject.sql.Inserts;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class PatientController {

    @FXML
    private Button fromPatientAddtoMenuButton;

    @FXML
    private Button patientAddButton;

    @FXML
    private TextField patientName;

    @FXML
    private TextField patientSurname;

    @FXML
    private TextField patientAge;

    @FXML
    private TextField patientDepartId;

    @FXML
    private TextField patientDiagnosId;

    @FXML
    void buttonAddPatient(ActionEvent event) {
        Inserts.newPatientInsert(patientName.getText(),patientSurname.getText(),Integer.parseInt(patientDiagnosId.getText()),
                Integer.parseInt(patientDepartId.getText()),Integer.parseInt(patientAge.getText()));
    }

    @FXML
    void fromPatientAddtoMenu(ActionEvent event) throws IOException {
        Main main = new Main();
        main.changeScene("main.fxml");
    }

}

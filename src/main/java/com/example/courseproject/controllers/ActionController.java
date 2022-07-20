package com.example.courseproject.controllers;

import com.example.courseproject.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class ActionController {

    @FXML
    private Button fromAcToInfoPatientButton;

    @FXML
    private Button fromActToInfoDepartButton;

    @FXML
    private Button fromActionDocToDocInfoButton;

    @FXML
    private Button fromDepartActToMenuButton;

    @FXML
    void fromAcToInfoPatient(ActionEvent event) throws IOException {
        Main main = new Main();
        main.changeScene("patientInfo.fxml");
    }

    @FXML
    void fromActToInfoDepart(ActionEvent event) {

    }

    @FXML
    void fromActionDocToDocInfo(ActionEvent event) throws IOException {
        Main main = new Main();
        main.changeScene("doctorInfo.fxml");
    }

    @FXML
    void fromDepartActToMenu(ActionEvent event) throws IOException {
        Main main = new Main();
        main.changeScene("main.fxml");
    }

    @FXML
    void fromActionToPatientDoc(ActionEvent event) throws IOException {
        Main main = new Main();
        main.changeScene("docPatients.fxml");
    }

}

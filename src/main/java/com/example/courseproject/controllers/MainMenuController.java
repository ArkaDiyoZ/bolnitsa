package com.example.courseproject.controllers;


import com.example.courseproject.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class MainMenuController{

    @FXML
    private Button fromMainToAddDocButton;

    @FXML
    private Button fromMainToAddPatientButton;

    @FXML
    void fromMainToAddDoctor(ActionEvent event) throws IOException {
        Main main = new Main();
        main.changeScene("doctorAdd.fxml");
    }

    @FXML
    void fromMainToAddPatinet(ActionEvent event) throws IOException {
        Main main = new Main();
        main.changeScene("patientAdd.fxml");
    }

    @FXML
    void fromMainToAddDepart(ActionEvent event) throws IOException{
        Main main = new Main();
        main.changeScene("departmentAdd.fxml");
    }

}

package com.example.courseproject.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class DocPatintsController implements Initializable {

    @FXML
    private TableColumn<Person, Integer> PatientDepartmentId;

    @FXML
    private Button doctorAddButton;

    @FXML
    private TextField doctorName;

    @FXML
    private TextField doctorSureName;

    @FXML
    private Label error;

    @FXML
    private Button fromDocAddtoMenuButton;

    @FXML
    private TableColumn<Person, Integer> patientAge;

    @FXML
    private TableColumn<Person, Integer> patientDiagnosId;

    @FXML
    private TableColumn<Person, String> patientName;

    @FXML
    private TableColumn<Person, String> patientSureName;

    @FXML
    void buttonAddDoctor(ActionEvent event) {

    }

    @FXML
    void fromDocAddtoMenu(ActionEvent event) {

    }


    @FXML
    private TableView<Person> table;

    ObservableList<Person> list = FXCollections.observableArrayList(
            new Person("Тестовый","Пациент",25,2,4),
            new Person("Василий","Иванов",37,1,4)
    );
    @Override
    public void initialize(URL location, ResourceBundle resources) {
       patientName.setCellValueFactory(new PropertyValueFactory<Person,String>("Имя пациента"));
       patientSureName.setCellValueFactory(new PropertyValueFactory<Person,String>("Фамилия пациента"));
       patientAge.setCellValueFactory(new PropertyValueFactory<Person,Integer>("Возраст пациента"));
       patientDiagnosId.setCellValueFactory(new PropertyValueFactory<Person,Integer>("Код диагноза"));
       PatientDepartmentId.setCellValueFactory(new PropertyValueFactory<Person,Integer>("Название отделения"));

        table.setItems(list);
    }
}

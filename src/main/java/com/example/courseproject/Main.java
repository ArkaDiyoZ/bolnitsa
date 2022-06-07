package com.example.courseproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {


    private static Stage stg;

    @Override
    public void start(Stage stage) throws IOException {

        stg = stage;
        stage.setResizable(false);

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("main.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),835 , 545);
        stage.setTitle("Clinic");
        stage.setScene(scene);
        stage.show();

    }

    public void changeScene(String fxml) throws IOException{
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stg.getScene().setRoot(pane);
    }



    public static void main(String[] args) {
        launch();
    }
}
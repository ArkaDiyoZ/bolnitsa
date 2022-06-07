package com.example.courseproject.another;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class MessageBox {

    public static void messageBoxInfo(String message){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Успешно");
        alert.setHeaderText(message);
        alert.showAndWait().ifPresent(rs -> {
            if (rs == ButtonType.OK) {
                System.out.println("Нажата кнопка ОК.");
            }
        });
    }

    public static void messageBoxError(String message){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Ошибка");
        alert.setHeaderText(message);
        alert.showAndWait().ifPresent(rs -> {
            if (rs == ButtonType.OK) {
                System.out.println("Нажата кнопка ОК.");
            }
        });
    }
}

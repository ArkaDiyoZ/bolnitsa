module com.example.courseproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.courseproject to javafx.fxml;
    exports com.example.courseproject;
    exports com.example.courseproject.controllers;
    opens com.example.courseproject.controllers to javafx.fxml;
    exports com.example.courseproject.sql;
    opens com.example.courseproject.sql to javafx.fxml;
}
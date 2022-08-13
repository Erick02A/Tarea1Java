module com.example.tarea1java {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tarea1java to javafx.fxml;
    exports com.example.tarea1java;
}
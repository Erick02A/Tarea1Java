package com.example.tarea1java;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.Objects;
import java.util.ResourceBundle;

public class HelloApplication extends Application {
    public ObservableList<Estudiante> Student;
    @Override
    public void start(Stage stage) throws Exception{
        String nombreCSVLeer = "C:\\Users\\Erick\\Desktop\\Datos I\\Tarea 1\\Tarea1Java\\src\\main\\java\\com\\example\\tarea1java\\Students.csv";
        String nombreCSVEscribir = "C:\\Users\\Erick\\Desktop\\Datos I\\Tarea 1\\Tarea1Java\\src\\main\\java\\com\\example\\tarea1java\\Students.csv";
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
        Listacsv listacsv = new Listacsv(nombreCSVLeer,nombreCSVEscribir,estudiantes);
        listacsv.leerFichero();
        Student = FXCollections.observableArrayList(Listacsv.getEstudiantes());
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 240);
        stage.setTitle("Hello");
        stage.setScene(scene);
        stage.show();

    }
}
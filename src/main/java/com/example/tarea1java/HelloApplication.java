package com.example.tarea1java;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class HelloApplication extends Application {
    private TableView<Estudiante> tv_Student;
    @Override
    public void start(Stage primarystage){
        String nombreCSVLeer = "C:\\Users\\Erick\\Desktop\\Datos I\\Tarea 1\\Tarea1Java\\src\\main\\java\\com\\example\\tarea1java\\Students.csv";
        String nombreCSVEscribir = "C:\\Users\\Erick\\Desktop\\Datos I\\Tarea 1\\Tarea1Java\\src\\main\\java\\com\\example\\tarea1java\\Students.csv";
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
        Listacsv listacsv = new Listacsv(nombreCSVLeer,nombreCSVEscribir,estudiantes);
        listacsv.leerFichero();
        listacsv.Mostrar();
        try {
            Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
            Scene scene = new Scene(root, 300, 250);
            primarystage.setTitle("Lista Notas Estudiantes");
            primarystage.setScene(scene);
            primarystage.show();
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
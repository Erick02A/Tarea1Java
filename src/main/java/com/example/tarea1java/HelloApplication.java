package com.example.tarea1java;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Objects;

public class HelloApplication extends Application {
    private TableView<Estudiante> tv_E;
    @Override
    public void start(Stage primarystage){
        String nombreCSVLeer = "C:\\Users\\Erick\\Desktop\\Datos I\\Tarea 1\\Tarea1Java\\src\\main\\java\\com\\example\\tarea1java\\Students.csv";
        String nombreCSVEscribir = "C:\\Users\\Erick\\Desktop\\Datos I\\Tarea 1\\Tarea1Java\\src\\main\\java\\com\\example\\tarea1java\\Students.csv";
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
        Listacsv listacsv = new Listacsv(nombreCSVLeer,nombreCSVEscribir,estudiantes);
        listacsv.leerFichero();
        System.out.println(listacsv.getEstudiantes());
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello-view.fxml")));
            Scene scene = new Scene(root, 300, 250);
            tv_E = (TableView<Estudiante>)scene.lookup("#tv_Student");
            TableColumn<Estudiante, String> Col_Carne = new TableColumn<Estudiante,String>("Carné");
            TableColumn<Estudiante, String> Col_NomApe = new TableColumn<Estudiante,String>("Nombre y Apellido");
            TableColumn<Estudiante, String> Col_Correo = new TableColumn<Estudiante,String>("Correo");
            TableColumn<Estudiante, String> Col_Telefono = new TableColumn<Estudiante,String>("Telefono");
            TableColumn<Estudiante, String> Col_NickName = new TableColumn<Estudiante,String>("NickName");
            TableColumn<Estudiante, String> Col_TipoEst = new TableColumn<Estudiante,String>("Tipo de Estudiante");
            TableColumn<Estudiante, String> Col_PromEx = new TableColumn<Estudiante,String>("Nota Promedio (Examenes)");
            TableColumn<Estudiante, String> Col_PromQui = new TableColumn<Estudiante,String>("Nota Promedio (Quices)");
            TableColumn<Estudiante, String> Col_PromTa = new TableColumn<Estudiante,String>("Nota Promedio (Tareas)");
            TableColumn<Estudiante, String> Col_Pro1 = new TableColumn<Estudiante,String>("Nota Proyecto #1");
            TableColumn<Estudiante, String> Col_Pro2 = new TableColumn<Estudiante,String>("Nota Proyecto #2");
            TableColumn<Estudiante, String> Col_Pro3 = new TableColumn<Estudiante,String>("Nota Proyecto #3");
            TableColumn<Estudiante, String> Col_PromPro = new TableColumn<Estudiante,String>("Nota Promedio Proyectos");
            TableColumn<Estudiante, String> Col_PromExQuiTa = new TableColumn<Estudiante,String>("Nota Promedio (Exa,Quiz,Tare)");
            Col_Carne.setCellValueFactory(new PropertyValueFactory<>("carne"));
            Col_NomApe.setCellValueFactory(new PropertyValueFactory<>("nombre y apellido"));
            Col_Correo.setCellValueFactory(new PropertyValueFactory<>("correo"));
            Col_Telefono.setCellValueFactory(new PropertyValueFactory<>("telefono"));
            Col_NickName.setCellValueFactory(new PropertyValueFactory<>("nickname"));
            Col_TipoEst.setCellValueFactory(new PropertyValueFactory<>("tipo estudiante"));
            Col_PromEx.setCellValueFactory(new PropertyValueFactory<>("promedio examen"));
            Col_PromQui.setCellValueFactory(new PropertyValueFactory<>("promedio quices"));
            Col_PromTa.setCellValueFactory(new PropertyValueFactory<>("promedio tareas"));
            Col_Pro1.setCellValueFactory(new PropertyValueFactory<>("proyecto 1"));
            Col_Pro2.setCellValueFactory(new PropertyValueFactory<>("proyecto 2"));
            Col_Pro3.setCellValueFactory(new PropertyValueFactory<>("proyecto 3"));
            Col_PromPro.setCellValueFactory(new PropertyValueFactory<>("promedio proyectos"));
            Col_PromExQuiTa.setCellValueFactory(new PropertyValueFactory<>("promedio examen quices y tareas"));

            ObservableList<Estudiante> e = FXCollections.observableArrayList(listacsv.getEstudiantes());
            tv_E.getColumns().setAll(Col_Carne,Col_NomApe,Col_Correo,Col_Telefono,Col_NickName,Col_TipoEst,Col_PromEx,Col_PromQui,Col_PromTa,Col_Pro1,Col_Pro2,Col_Pro3,Col_PromPro,Col_PromExQuiTa);
            tv_E.getItems().setAll(e);

            primarystage.setTitle("Lista Notas Estudiantes");
            primarystage.setScene(scene);
            primarystage.show();
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
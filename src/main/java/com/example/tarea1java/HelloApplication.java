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
    @FXML
    private TableColumn<Estudiante, String> NickName;
    @FXML
    private TableColumn<Estudiante, String> NomApe;
    @FXML
    private TableColumn<Estudiante, Double> NotaPro1;
    @FXML
    private TableColumn<Estudiante, Double> NotaPro2;
    @FXML
    private TableColumn<Estudiante, Double> NotaPro3;
    @FXML
    private TableColumn<Estudiante, Double> NotaPromEx;
    @FXML
    private TableColumn<Estudiante, Double> NotaPromExQuiTa;
    @FXML
    private TableColumn<Estudiante, Double> NotaPromPro;
    @FXML
    private TableColumn<Estudiante, Double> NotaPromQui;
    @FXML
    private TableColumn<Estudiante, Double> NotaPromTa;
    @FXML
    private TableColumn<Estudiante, String> Telefono;
    @FXML
    private TableColumn<Estudiante, String> TipoEst;
    @FXML
    private TableColumn<Estudiante, String> carne;
    @FXML
    private TableColumn<Estudiante, String> correo;
    @FXML
    private TableView<Estudiante> tv_E;
    @Override
    public void start(Stage stage) throws Exception{
        String nombreCSVLeer = "C:\\Users\\Erick\\Desktop\\Datos I\\Tarea 1\\Tarea1Java\\src\\main\\java\\com\\example\\tarea1java\\Students.csv";
        String nombreCSVEscribir = "C:\\Users\\Erick\\Desktop\\Datos I\\Tarea 1\\Tarea1Java\\src\\main\\java\\com\\example\\tarea1java\\Students.csv";
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
        Listacsv listacsv = new Listacsv(nombreCSVLeer,nombreCSVEscribir,estudiantes);
        listacsv.leerFichero();
        System.out.println(listacsv.getEstudiantes());
        listacsv.mostrar();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            carne.setCellValueFactory(new PropertyValueFactory<>("carne"));
            NomApe.setCellValueFactory(new PropertyValueFactory<>("NomApe"));
            correo.setCellValueFactory(new PropertyValueFactory<>("correo"));
            Telefono.setCellValueFactory(new PropertyValueFactory<>("Telefono"));
            NickName.setCellValueFactory(new PropertyValueFactory<>("NickName"));
            TipoEst.setCellValueFactory(new PropertyValueFactory<>("TipoEst"));
            NotaPromEx.setCellValueFactory(new PropertyValueFactory<>("NotaPromEx"));
            NotaPromQui.setCellValueFactory(new PropertyValueFactory<>("NotaPromQui"));
            NotaPromTa.setCellValueFactory(new PropertyValueFactory<>("NotaPromTa"));
            NotaPro1.setCellValueFactory(new PropertyValueFactory<>("NotaPro1"));
            NotaPro2.setCellValueFactory(new PropertyValueFactory<>("NotaPro2"));
            NotaPro3.setCellValueFactory(new PropertyValueFactory<>("NotaPro3"));
            NotaPromPro.setCellValueFactory(new PropertyValueFactory<>("NotaPromPro"));
            NotaPromExQuiTa.setCellValueFactory(new PropertyValueFactory<>("NotaPromExQuiTa"));

            ObservableList<Estudiante> e = FXCollections.observableArrayList(listacsv.getEstudiantes());
            tv_E.getItems().setAll(e);
        stage.setTitle("Hello");
        stage.setScene(scene);
        stage.show();

    }
}
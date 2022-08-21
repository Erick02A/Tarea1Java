package com.example.tarea1java;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private TableColumn<Estudiante, String> colNickName;
    @FXML
    private TableColumn<Estudiante, String> colNomApe;
    @FXML
    private TableColumn<Estudiante, Double> colNotaPro1;
    @FXML
    private TableColumn<Estudiante, Double> colNotaPro2;
    @FXML
    private TableColumn<Estudiante, Double> colNotaPro3;
    @FXML
    private TableColumn<Estudiante, Double> colNotaPromEx;
    @FXML
    private TableColumn<Estudiante, Double> colNotaPromExQuiTa;
    @FXML
    private TableColumn<Estudiante, Double> colNotaPromPro;
    @FXML
    private TableColumn<Estudiante, Double> colNotaPromQui;
    @FXML
    private TableColumn<Estudiante, Double> colNotaPromTa;
    @FXML
    private TableColumn<Estudiante, String> colTelefono;
    @FXML
    private TableColumn<Estudiante, String> colTipoEst;
    @FXML
    private TableColumn<Estudiante, String> colcarne;
    @FXML
    private TableColumn<Estudiante, String> colcorreo;
    @FXML
    private TableView<Estudiante> tv_E;
    private ObservableList<Estudiante> Students;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Students = FXCollections.observableArrayList(Listacsv.getEstudiantes());
        colcarne.setCellValueFactory(new PropertyValueFactory<Estudiante,String>("carne"));
        colNomApe.setCellValueFactory(new PropertyValueFactory<Estudiante,String>("NomApe"));
        colcorreo.setCellValueFactory(new PropertyValueFactory<Estudiante,String>("correo"));
        colTelefono.setCellValueFactory(new PropertyValueFactory<Estudiante,String>("Telefono"));
        colNickName.setCellValueFactory(new PropertyValueFactory<Estudiante,String>("Nickname"));
        colTipoEst.setCellValueFactory(new PropertyValueFactory<Estudiante,String>("TipoEst"));
        colNotaPromEx.setCellValueFactory(new PropertyValueFactory<Estudiante,Double>("NotaPromEx"));
        colNotaPromQui.setCellValueFactory(new PropertyValueFactory<Estudiante,Double>("NotaPromQui"));
        colNotaPromTa.setCellValueFactory(new PropertyValueFactory<Estudiante,Double>("NotaPromTa"));
        colNotaPro1.setCellValueFactory(new PropertyValueFactory<Estudiante,Double>("NotaPro1"));
        colNotaPro2.setCellValueFactory(new PropertyValueFactory<Estudiante,Double>("NotaPro2"));
        colNotaPro3.setCellValueFactory(new PropertyValueFactory<Estudiante,Double>("NotaPro3"));
        colNotaPromPro.setCellValueFactory(new PropertyValueFactory<Estudiante,Double>("NotaPromPro"));
        colNotaPromExQuiTa.setCellValueFactory(new PropertyValueFactory<Estudiante,Double>("NotaPromExQuiTa"));
        tv_E.getItems().setAll(Students);
    }

}
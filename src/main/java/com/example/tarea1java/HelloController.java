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
        System.out.println(Students);
        tv_E = new TableView<Estudiante>();
        colcarne = new TableColumn<>();
        colNomApe = new TableColumn<>();
        colcorreo = new TableColumn<>();
        colTelefono = new TableColumn<>();
        colNickName = new TableColumn<>();
        colTipoEst = new TableColumn<>();
        colNotaPromEx = new TableColumn<>();
        colNotaPromQui = new TableColumn<>();
        colNotaPromTa = new TableColumn<>();
        colNotaPro1 = new TableColumn<>();
        colNotaPro2 = new TableColumn<>();
        colNotaPro3 = new TableColumn<>();
        colNotaPromPro = new TableColumn<>();
        colNotaPromExQuiTa = new TableColumn<>();
        colcarne.setCellValueFactory(new PropertyValueFactory<>("this.carne"));
        colNomApe.setCellValueFactory(new PropertyValueFactory<>("this.NomApe"));
        colcorreo.setCellValueFactory(new PropertyValueFactory<>("this.correo"));
        colTelefono.setCellValueFactory(new PropertyValueFactory<>("this.Telefono"));
        colNickName.setCellValueFactory(new PropertyValueFactory<>("this.Nickname"));
        colTipoEst.setCellValueFactory(new PropertyValueFactory<>("this.TipoEst"));
        colNotaPromEx.setCellValueFactory(new PropertyValueFactory<>("this.NotaPromEx"));
        colNotaPromQui.setCellValueFactory(new PropertyValueFactory<>("this.NotaPromQui"));
        colNotaPromTa.setCellValueFactory(new PropertyValueFactory<>("this.NotaPromTa"));
        colNotaPro1.setCellValueFactory(new PropertyValueFactory<>("this.NotaPro1"));
        colNotaPro2.setCellValueFactory(new PropertyValueFactory<>("this.NotaPro2"));
        colNotaPro3.setCellValueFactory(new PropertyValueFactory<>("this.NotaPro3"));
        colNotaPromPro.setCellValueFactory(new PropertyValueFactory<>("this.NotaPromPro"));
        colNotaPromExQuiTa.setCellValueFactory(new PropertyValueFactory<>("this.NotaPromExQuiTa"));
        tv_E.getItems().setAll(Students);
    }

}
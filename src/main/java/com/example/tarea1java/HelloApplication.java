package com.example.tarea1java;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Stack;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primarystage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        //Label label = new Label("Me cago en tu vida");
        //StackPane root = new StackPane();
        //root.getChildren().add(label);
        Scene scene = new Scene(fxmlLoader.load(),700, 500);
        primarystage.setTitle("Hello!");
        primarystage.setScene(scene);
        primarystage.show();
    }

    public static void main(String[] args) {
        //System.out.println("Hola a todos");
        //Student est1 = new Student("Luis");
        //est1.llamar();
        //Student est2 = new Student("Fernando");
        //est2.llamar();
        //String minombre = est1.nombre;
        //System.out.println(minombre);
        //Student_hijo est3 = new Student_hijo("Sebastian", 90, 80);
        //int nota_promedio = est3.promedio();
        //System.out.println(nota_promedio);
        //est3.llamar();
        launch();
    }
}
package com.example.tarea1java;

import java.util.ArrayList;

public class Prueba01 {
    public static void main(String[] args){
        String nombreCSVLeer = "C:\\Users\\Erick\\Desktop\\Datos I\\Tarea 1\\Tarea1Java\\src\\main\\java\\com\\example\\tarea1java\\Students.csv";
        String nombreCSVEscribir = "C:\\Users\\Erick\\Desktop\\Datos I\\Tarea 1\\Tarea1Java\\src\\main\\java\\com\\example\\tarea1java\\Students.csv";
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
        Listacsv listacsv = new Listacsv(nombreCSVLeer,nombreCSVEscribir,estudiantes);
        listacsv.leerFichero();
        listacsv.mostrar();
    }
}

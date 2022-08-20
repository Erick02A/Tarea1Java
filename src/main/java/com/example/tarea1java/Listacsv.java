package com.example.tarea1java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Listacsv {
    private String nombreCSVLeer;
    private String nombreCSVEscribir;
    public static ArrayList<Estudiante> estudiantes;

    public static ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public Listacsv(String nombreCSVLeer, String nombreCSVEscribir, ArrayList<Estudiante> estudiantes) {
        this.nombreCSVLeer = nombreCSVLeer;
        this.nombreCSVEscribir = nombreCSVEscribir;
        if(estudiantes == null) {
            this.estudiantes = new ArrayList<Estudiante>();
        }
        else {
            this.estudiantes = estudiantes;
        }
    }
    public void mostrar() {
        for (Estudiante e : estudiantes) {
        System.out.println(e.carne+" | "+e.NomApe+" | "+e.correo+" | "+e.Telefono+" | "+e.Nickname+" | "+e.TipoEst+" | "+e.NotaPromEx+" | "+e.NotaPromQui+" | "+e.NotaPromTa+" | "+e.NotaPro1+" | "+e.NotaPro2+" | "+e.NotaPro3+" | "+e.NotaPromPro+" | "+e.NotaPromExQuiTa);
        }
    }
    public void leerFichero(){
        FileReader fr;
        try {
            fr = new FileReader(this.nombreCSVLeer);
            String linea = "";
            BufferedReader br = new BufferedReader(fr);
            while ((linea = br.readLine()) != null){
                String[] datos = linea.split(",");
                String carne = datos[0];
                String NomApe = datos[1];
                String correo = datos[2];
                String Telefono = datos[3];
                String Nickname = datos[4];
                String TipoEst = datos[5];
                String NotaPromEx = datos[6];
                String NotaPromQui = datos[7];
                String NotaPromTa = datos[8];
                String NotaPro1 = datos[9];
                String NotaPro2 = datos[10];
                String NotaProm3 = datos[11];
                double NotaPromPro = 0.0;
                double NotaPromExQuiTa = 0.0;
                if (datos[5].equals("A")) {
                    Estudiante e = new EstudianteA(carne, NomApe, correo, Telefono, Nickname, TipoEst, Double.parseDouble(NotaPromEx), Double.parseDouble(NotaPromQui), Double.parseDouble(NotaPromTa), Double.parseDouble(NotaPro1), Double.parseDouble(NotaPro2), Double.parseDouble(NotaProm3), NotaPromPro, NotaPromExQuiTa);
                    this.estudiantes.add(e);
                } else if (datos[5].equals("B")) {
                    Estudiante e = new EstudianteB(carne, NomApe, correo, Telefono, Nickname, TipoEst, Double.parseDouble(NotaPromEx), Double.parseDouble(NotaPromQui), Double.parseDouble(NotaPromTa), Double.parseDouble(NotaPro1), Double.parseDouble(NotaPro2), Double.parseDouble(NotaProm3), NotaPromPro, NotaPromExQuiTa);
                    this.estudiantes.add(e);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}

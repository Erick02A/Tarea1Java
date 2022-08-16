package com.example.tarea1java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Listacsv {
    private String nombreCSVLeer;
    private String nombreCSVEscribir;
    private ArrayList<Estudiante> estudiantes;

    public Listacsv(String nombreCSVLeer,String nombreCSVEscribir,ArrayList<Estudiante> estudiantes) {
        this.nombreCSVLeer = nombreCSVLeer;
        this.nombreCSVEscribir = nombreCSVEscribir;
        if(estudiantes == null) {
            this.estudiantes = new ArrayList<Estudiante>();
        }
        else {
            this.estudiantes = estudiantes;
        }
    }
    public void mostrar(){
        for(Estudiante e: this.estudiantes){
            System.out.println(e.getNotaPromExQuiTa());
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
                double NotaPromEx = Double.parseDouble(datos[6]);
                double NotaPromQui = Double.parseDouble(datos[7]);
                double NotaPromTa = Double.parseDouble(datos[8]);
                double NotaPro1 = Double.parseDouble(datos[9]);
                double NotaPro2 = Double.parseDouble(datos[10]);
                double NotaProm3 = Double.parseDouble(datos[11]);
                double NotaPromPro = 0.0;
                double NotaPromExQuiTa = 0.0;

                if (datos[5].equals("A")){
                    Estudiante e = new EstudianteA(carne, NomApe, correo, Telefono, Nickname, TipoEst, NotaPromEx, NotaPromQui, NotaPromTa, NotaPro1, NotaPro2, NotaProm3, NotaPromPro, NotaPromExQuiTa);
                    this.estudiantes.add(e);
                }
                else{
                    Estudiante e = new EstudianteB(carne, NomApe, correo, Telefono, Nickname, TipoEst, NotaPromEx, NotaPromQui, NotaPromTa, NotaPro1, NotaPro2, NotaProm3, NotaPromPro, NotaPromExQuiTa);
                    this.estudiantes.add(e);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

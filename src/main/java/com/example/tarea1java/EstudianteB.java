package com.example.tarea1java;
//Ejemplo de clase
public class EstudianteB extends Estudiante{
    //Estas son clases hijo, lo que ejemplifica herencia
    public EstudianteB(String carne, String NomApe, String correo, String Telefono, String Nickname, String TipoEst, double NotaPromEx, double NotaPromQui, double NotaPromTa, double NotaPro1, double NotaPro2, double NotaPro3, double NotaPromPro, double NotaPromExQuiTa, double NotaFinal) {
        super(carne, NomApe, correo, Telefono, Nickname, TipoEst, NotaPromEx, NotaPromQui, NotaPromTa, NotaPro1, NotaPro2, NotaPro3, NotaPromPro, NotaPromExQuiTa,NotaFinal);
    calculaprom();
    }
    //Ejemplo de un metodo
    public void calculaprom () {
        setNotaPromPro((getNotaPro1() + getNotaPro2() + getNotaPro3()) / 3);
        setNotaFinal((getNotaPromEx()*0.20)+getNotaPromQui()*0.10+getNotaPromTa()*0.10+getNotaPromPro()*0.60);
    }
}

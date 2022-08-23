package com.example.tarea1java;
//Ejemplo de clase
public class EstudianteA extends Estudiante{
    //Estas son clases hijo, lo que ejemplifica herencia
    public EstudianteA(String carne, String NomApe, String correo, String Telefono, String Nickname, String TipoEst, double NotaPromEx, double NotaPromQui, double NotaPromTa, double NotaPro1, double NotaPro2, double NotaPro3, double NotaPromPro, double NotaPromExQuiTa,double NotaFinal) {
        super(carne, NomApe, correo, Telefono, Nickname, TipoEst, NotaPromEx, NotaPromQui, NotaPromTa, NotaPro1, NotaPro2, NotaPro3, NotaPromPro, NotaPromExQuiTa,NotaFinal);
    calculaprom();
    }
    //Ejemplo de un metodo
    public void calculaprom (){
            setNotaPromExQuiTa((getNotaPromEx()+getNotaPromQui()+getNotaPromTa())/3);
            setNotaFinal((getNotaPromEx()*0.20)+getNotaPromQui()*0.10+getNotaPromTa()*0.10+getNotaPro1()*0.20+getNotaPro2()*0.20+getNotaPro3()*0.20);
    }

}

package com.example.tarea1java;

public class EstudianteA extends Estudiante{
    public EstudianteA(String carne, String NomApe, String correo, String Telefono, String Nickname, String TipoEst, double NotaPromEx, double NotaPromQui, double NotaPromTa, double NotaPro1, double NotaPro2, double NotaPro3, double NotaPromPro, double NotaPromExQuiTa) {
        super(carne, NomApe, correo, Telefono, Nickname, TipoEst, NotaPromEx, NotaPromQui, NotaPromTa, NotaPro1, NotaPro2, NotaPro3, NotaPromPro, NotaPromExQuiTa);
    calculaprom();
    }
    public void calculaprom (){
            NotaPromExQuiTa = (NotaPromEx+NotaPromQui+NotaPromTa)/3;
    }

}

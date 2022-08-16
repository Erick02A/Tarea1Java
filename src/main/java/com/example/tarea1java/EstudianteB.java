package com.example.tarea1java;

public class EstudianteB extends Estudiante{
    public EstudianteB(String carne, String NomApe, String correo, String Telefono, String Nickname, String TipoEst, double NotaPromEx, double NotaPromQui, double NotaPromTa, double NotaPro1, double NotaPro2, double NotaPro3, double NotaPromPro, double NotaPromExQuiTa) {
        super(carne, NomApe, correo, Telefono, Nickname, TipoEst, NotaPromEx, NotaPromQui, NotaPromTa, NotaPro1, NotaPro2, NotaPro3, NotaPromPro, NotaPromExQuiTa);
    }
    public void calculaprom () {
        NotaPromPro = (NotaPro1 + NotaPro2 + NotaPro3) / 3;
    }
}

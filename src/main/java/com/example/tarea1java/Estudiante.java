package com.example.tarea1java;

public abstract class Estudiante {
    private final String carne ;
    private final String NomApe;
    private final String correo;
    private final String Telefono;
    private final String Nickname;
    private final String TipoEst;
    private final double NotaPromEx;
    private final double NotaPromQui;
    private final double NotaPromTa;
    private final double NotaPro1;
    private final double NotaPro2;
    private final double NotaPro3;
    private double NotaPromPro;
    private double NotaPromExQuiTa;

    public Estudiante(String carne, String NomApe, String correo, String Telefono, String Nickname, String TipoEst, double NotaPromEx, double NotaPromQui, double NotaPromTa, double NotaPro1, double NotaPro2, double NotaPro3, double NotaPromPro, double NotaPromExQuiTa){
        this.carne= carne;
        this.NomApe= NomApe;
        this.correo= correo;
        this.Telefono= Telefono;
        this.Nickname= Nickname;
        this.TipoEst= TipoEst;
        this.NotaPromEx=NotaPromEx;
        this.NotaPromQui=NotaPromQui;
        this.NotaPromTa=NotaPromTa;
        this.NotaPro1=NotaPro1;
        this.NotaPro2=NotaPro2;
        this.NotaPro3=NotaPro3;
        this.NotaPromPro=NotaPromPro;
        this.NotaPromExQuiTa=NotaPromExQuiTa;
    }
    public String getCarne() {
        return carne;
    }
    public String getNomApe() {
        return NomApe;
    }
    public String getCorreo() {
        return correo;
    }
    public String getTelefono() {
        return Telefono;
    }
    public String getNickname() {
        return Nickname;
    }
    public String getTipoEst() {
        return TipoEst;
    }
    public double getNotaPromEx() {return NotaPromEx;}
    public double getNotaPromQui() {return NotaPromQui;}
    public double getNotaPromTa() {return NotaPromTa;}
    public double getNotaPro1() {return NotaPro1;}
    public double getNotaPro2() {return NotaPro2;}
    public double getNotaPro3() {return NotaPro3;}
    public double getNotaPromPro() {return NotaPromPro;}
    public double getNotaPromExQuiTa() {return NotaPromExQuiTa;}

    public void setNotaPromPro(double notaPromPro) {
        NotaPromPro = notaPromPro;
    }

    public void setNotaPromExQuiTa(double notaPromExQuiTa) {
        NotaPromExQuiTa = notaPromExQuiTa;
    }
}



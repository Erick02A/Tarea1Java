package com.example.tarea1java;

public abstract class Estudiante {
    protected final String carne ;
    protected final String NomApe;
    protected final String correo;
    protected final String Telefono;
    protected final String Nickname;
    protected final String TipoEst;
    protected final double NotaPromEx;
    protected final double NotaPromQui;
    protected final double NotaPromTa;
    protected final double NotaPro1;
    protected final double NotaPro2;
    protected final double NotaPro3;
    protected double NotaPromPro;
    protected double NotaPromExQuiTa;

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

}



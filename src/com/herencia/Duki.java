package com.herencia;

import java.util.ArrayList;

public class Duki extends Trappers{
    private String nombreReal;
    private int edad;

    //constructores
    public Duki(){

    }
    public Duki(String nombreArt, ArrayList<String> canciones, int edad,String nombreReal) {
        super(nombreArt, canciones);
        this.edad = edad;
        this.nombreReal = nombreReal;
    }

    //getters y setters
    public String getNombreReal() {
        return nombreReal;
    }
    public void setNombreReal(String nombreReal) {
        this.nombreReal = nombreReal;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

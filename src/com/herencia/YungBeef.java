package com.herencia;

import java.util.ArrayList;

public class YungBeef extends Trappers{
    private String nombreReal2;
    private ArrayList<String> amigos=new ArrayList<String>();

    //constructor
    public YungBeef() {
    }
    public YungBeef(String nombreArt, ArrayList<String> canciones, String nombreReal2, ArrayList<String> amigos) {
        super(nombreArt, canciones);
        this.nombreReal2 = nombreReal2;
        this.amigos=amigos;
    }

    //getters y setters
    public String getNombreReal2() {
        return nombreReal2;
    }
    public void setNombreReal2(String nombreReal2) {
        this.nombreReal2 = nombreReal2;
    }
    public ArrayList<String> getAmigos() {
        return amigos;
    }
    public void setAmigos(ArrayList<String> amigos) {
        this.amigos = amigos;
    }


}

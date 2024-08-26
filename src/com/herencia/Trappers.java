package com.herencia;

import java.util.ArrayList;

public class Trappers {
    //atributos
    protected String nombreArt;
    protected ArrayList<String> canciones=new ArrayList<String>();

    //constructores
    public Trappers() {
    }
    public Trappers(String nombreArt,ArrayList<String> canciones) {
        this.nombreArt = nombreArt;
        this.canciones = canciones;
    }

    //getters y setters
    public String getNombreArt() {
        return nombreArt;
    }
    public void setNombreArt(String nombreArt) {
        this.nombreArt = nombreArt;
    }
    public ArrayList<String> getCanciones() {
        return canciones;
    }
    public void setCanciones(ArrayList<String> canciones) {
        this.canciones = canciones;
    }

    //metodo
    public void presentacion(){
        System.out.println("Hola, soy trapper y hago canciones");
    }
}

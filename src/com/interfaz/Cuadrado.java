package com.interfaz;

public class Cuadrado implements Figura,Dibujable{
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    @Override
    public double calcularArea(){
        double resultado=lado*lado;
        return resultado;
    }
    @Override
    public void dibujar(){
        System.out.println("Estor dibujando un cuadrado");
    }
}

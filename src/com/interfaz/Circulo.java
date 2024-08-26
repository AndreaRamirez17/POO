package com.interfaz;

public class Circulo implements Figura,Dibujable,Rotable{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea(){
        double resultado=Math.PI*radio*radio;
        return resultado;
    }
    @Override
    public void dibujar(){
        System.out.println("Estoy dibujando un circulo");
    }
    @Override
    public void rotar(){
        System.out.println("Estor rotando un circulo");
    }

}

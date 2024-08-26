package com.abstractClass;

public class AbsClass {
    public static void main(String[] args){
        //creamos objetos
        Circulo circ=new Circulo(3,5,3);
        Cuadrado cuadrado=new Cuadrado(3,5,3);
        System.out.println("el area del circulo es "+ circ.calcularArea());
        System.out.println("el area del cuadrado es "+ cuadrado.calcularArea());
    }
}

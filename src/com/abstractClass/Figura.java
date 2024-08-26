package com.abstractClass;

public abstract class Figura {
    protected double x;
    protected double y;
     //constructores
    protected Figura(){}
    protected Figura(double x,double y) {
        this.x = x;
        this.y=y;
    }
    //metodo
    public abstract double calcularArea();
}

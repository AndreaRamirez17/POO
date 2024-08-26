package com.herencia;
import java.util.ArrayList;
public class Herencia {
    public static void main(String[] args){
        //Crear nuestros objetos
        Duki duko=new Duki();
        YungBeef seko=new YungBeef();

        // Crear un ArrayList de canciones
        ArrayList<String> canciones = new ArrayList<>();
        canciones.add("She Don't Give a FO");
        canciones.add("Goteo");
        canciones.add("Hablamos Mañana");

        ArrayList<String> canciones2=new ArrayList<>();
        canciones2.add("Effy");
        canciones2.add("Camino solo");
        canciones2.add("LMDA");

        ArrayList<String> amigos=new ArrayList<>();
        amigos.add("Kaydy Cain");
        amigos.add("Khaled");

        // Usar el método setCanciones para cargar el ArrayList
        duko.setCanciones(canciones);
        duko.setNombreArt("DUKI");
        duko.setEdad(24);
        duko.setNombreReal("Mauro");
        seko.setNombreArt("Yung Beef");
        seko.setNombreReal2("Fernando");
        seko.setCanciones(canciones2);
        seko.setAmigos(amigos);


        System.out.println("El artista Argentino "+duko.getNombreReal()+" de "+duko.getEdad()+" años, mejor conocido como "+duko.getNombreArt()+" lanzó su nueva canción "+duko.getCanciones().get(1));
        System.out.println("El artista Español "+seko.getNombreReal2()+" mejor conocido como "+seko.getNombreArt()+" lanzó su nueva canción "+seko.getCanciones().get(2)+" al lado de sus amigos "+seko.getAmigos().get(0)+" y "+seko.getAmigos().get(1));
    }
}

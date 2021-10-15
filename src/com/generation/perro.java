package com.generation;

public class perro {
    String nombre;
    String raza;
    int edad;
    String tamaño;
    public void caracteristicas() {
        System.out.println("Hola, mi nombre es " + this.nombre + " soy de la raza " + this.raza + " tengo " + this.edad + " años de edad "  + "soy de tamaño" + this.tamaño);

    }
    public void comer(){
        System.out.println("estoy comiendo");
    }
    public void dormir(){
        System.out.println("me gusta dormir");
    }
    public void jugar(){
        System.out.println("me gusta jugar");
    }
}

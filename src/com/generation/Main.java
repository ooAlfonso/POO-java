package com.generation;

public class Main {

    public static void main(String[] args) {
	// write your code here
        perro lomito = new perro();
        lomito.nombre = "chems";
        lomito.edad = 1;
        lomito.raza = "mestizo";
        lomito.tamaño = "grande";
        lomito.caracteristicas();
        lomito.comer();

        perro lomito2 = new perro();
        lomito2.nombre = "firulais";
        lomito2.edad = 2;
        lomito2.raza = "pug";
        lomito2.tamaño = "chico";
        lomito2.caracteristicas();
        lomito.dormir();


    }
}

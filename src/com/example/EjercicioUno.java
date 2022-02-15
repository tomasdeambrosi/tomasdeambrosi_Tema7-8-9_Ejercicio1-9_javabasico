package com.example;

// Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.

public class EjercicioUno {

    public static void main(String[] args) {

        String arrayUno [] = {"azul", "verde", "rojo", "violeta", "amarillo"};

        for(String i: arrayUno){
            System.out.println("El color actual es: " + i);
        }

    }


}

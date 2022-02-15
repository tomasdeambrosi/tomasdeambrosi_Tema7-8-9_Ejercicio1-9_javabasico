package com.example;

// Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada
// elemento en ambas dimensiones.

public class EjercicioDos {

    public static void main(String[] args) {

        int arrayDos [] [] = new int [3] [3];

        arrayDos [0] [0] = 1;
        arrayDos [0] [1] = 2;
        arrayDos [0] [2] = 3;

        arrayDos [1] [0] = 10;
        arrayDos [1] [1] = 20;
        arrayDos [1] [2] = 30;

        arrayDos [2] [0] = 100;
        arrayDos [2] [1] = 200;
        arrayDos [2] [2] = 300;

        for(int i = 0; i < arrayDos.length; i++){
            System.out.println("Valor de i: " + i);

            for(int j = 0; j <arrayDos[i].length; j++){
                System.out.println("Estoy en i: " + i + ", j: " +j);
                System.out.println(arrayDos[i][j]);
            }
        }

    }
}

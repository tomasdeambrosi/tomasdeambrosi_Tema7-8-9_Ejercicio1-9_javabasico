package com.example;

import java.util.ArrayList;

// Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
// A continuación, con otro bucle, recórrelo y elimina los numeros pares.
// Por último, vuelve a recorrerlo y muestra el ArrayList final.
// Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.



public class EjercicioSeis {

    public static void main(String[] args) {

        ArrayList<Integer> arrayListDos = new ArrayList<Integer>();

        for(int i = 1; i <= 10; i++){
            arrayListDos.add(i);
        }

        System.out.println(arrayListDos);

        for(int i = 0; i < arrayListDos.size(); i++){
            if(i % 2 == 0){
                arrayListDos.remove(i);
            }
        }

        System.out.println(arrayListDos);
    }
}

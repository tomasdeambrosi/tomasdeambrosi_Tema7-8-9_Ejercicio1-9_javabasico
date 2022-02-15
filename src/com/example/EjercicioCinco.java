package com.example;

// Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
// Recorre ambos mostrando únicamente el valor de cada elemento.

import java.util.ArrayList;
import java.util.LinkedList;

public class EjercicioCinco {

    public static void main(String[] args) {

        ArrayList<String> arrayListUno = new ArrayList<String>();

        arrayListUno.add("Nombre 1");
        arrayListUno.add("Nombre 2");
        arrayListUno.add("Nombre 3");
        arrayListUno.add("Nombre 4");

        LinkedList<String> linkedListUno = new LinkedList<String>(arrayListUno);

        for(String nombreActual : arrayListUno){
            System.out.println("El nombre actual de la ArrayList es: " + nombreActual);
        }

        for(String nombreActual : linkedListUno){
            System.out.println("El nombre actual de la LinkedList es: " + nombreActual);
        }





    }

}

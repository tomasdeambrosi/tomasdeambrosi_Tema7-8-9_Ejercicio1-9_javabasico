package com.example;

// Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
// Elimina el 2o y 3er elemento y muestra el resultado final.

import java.util.Vector;

public class EjercicioTres {

    public static void main(String[] args) {

        Vector<String> vectorUno = new Vector();

        vectorUno.add("Nombre 1");
        vectorUno.add("Nombre 2");
        vectorUno.add("Nombre 3");
        vectorUno.add("Nombre 4");
        vectorUno.add("Nombre 5");

        System.out.println(vectorUno);

        vectorUno.remove(1);
        vectorUno.remove(1);

        System.out.println(vectorUno);

    }

}

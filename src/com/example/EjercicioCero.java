package com.example;

// Dada la función: public static String reverse(String texto){}
// Escribe el código que devuelva una cadena al revés.
// Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".

public class EjercicioCero {

    public static void main(String[] args) {

        String cadena = "Hola mundo";

        reverse(cadena);

    }

    public static void reverse(String texto){
        reverseUno(texto);
        reverseDos(texto);
    }

    public static String reverseUno(String cuerpo) {
        for (int i = cuerpo.length() - 1; i < cuerpo.length() && i != 0; i--) {
            System.out.print(cuerpo.charAt(i));
        }
        return cuerpo;
    }

    public static String reverseDos(String inicio) {
        System.out.println(inicio.charAt(0));
        return inicio;
    }
}


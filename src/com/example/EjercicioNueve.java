package com.example;

// Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream,
// excepciones, un HashMap y un ArrayList, LinkedList o array.

import java.util.*;

public class EjercicioNueve {

    static HashMap<String, Integer> personas = new HashMap<>();

    static ArrayList<String> esMayor = new ArrayList<>();
    static ArrayList<String> noEsMayor = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Bienvenido a Saber si es mayor de edad");

        // 1 - Se solicita la cantidad de personas a ingresar

        boolean okUno = false;
        int personasParaIngresar = 0;

        do{
            Scanner numeroDePersonas = new Scanner(System.in);
            System.out.println("¿Cuántas personas va a ingresar al sistema?");
            try{
                personasParaIngresar = numeroDePersonas.nextInt();
                okUno = true;
            }catch(InputMismatchException e){
                System.out.println("No es una cantidad válida");
            }
        }while(!okUno);

        // 2 - Se piden los datos de las personas y se guardan en el HashMap "personas"

        for (int i = 1; i <= personasParaIngresar; i++){
            Scanner nombre = new Scanner(System.in);
            System.out.println("Ingrese nombre de persona n°" + i + " de " + personasParaIngresar);
            String a = nombre.next();
            boolean okDos = false;

            do{
                Scanner edad = new Scanner(System.in);
                System.out.println("Ingrese edad de: " + a);
                try{
                    int b = edad.nextInt();
                    okDos = true;
                    personas.put(a, b);
                }catch(InputMismatchException e){
                    System.out.println("No es una edad válida");
                }
            }while(!okDos);

        }

        // 3 - Se guarda a las personas en el arraylist correspondiente (esMayor o noEsMayor)

        int mayoriaDeEdad = 18;

        for (Map.Entry elemento : personas.entrySet()){
            if ((Integer) elemento.getValue() >= mayoriaDeEdad){
                esMayor.add((String) elemento.getKey());
            }else{
                noEsMayor.add((String) elemento.getKey());
            }
        }

        // 4 - Se imprimen los resultados

        for(String mayor : esMayor){
            System.out.println(mayor + " es mayor de edad");
        }
        for(String noMayor : noEsMayor){
            System.out.println(noMayor + " no es mayor de edad");
        }
    }
}

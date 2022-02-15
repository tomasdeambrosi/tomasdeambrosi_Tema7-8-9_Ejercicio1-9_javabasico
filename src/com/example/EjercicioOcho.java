package com.example;

// Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
// La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en
// "fileOut".

import java.io.*;

public class EjercicioOcho {

    public static void main(String[] args) {

        copiarFichero("ruta entrada archivo original", "ruta salida archivo copia");

    }

    public static void copiarFichero(String fileIn, String fileOut) {
        try{
            InputStream in = new FileInputStream(fileIn);

            try{
                byte datos [] = in.readAllBytes();
                in.close();

                PrintStream out = new PrintStream(fileOut);
                out.write(datos);
                out.close();

            }catch(IOException e){
                System.out.println("¡Error! " + e.getMessage());
            }
        }catch(FileNotFoundException e){
            System.out.println("El archivo no pudo ser encontrado " + e.getMessage());
        }
    }
}

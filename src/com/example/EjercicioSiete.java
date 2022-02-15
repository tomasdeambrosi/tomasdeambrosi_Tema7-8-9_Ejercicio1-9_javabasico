package com.example;

// Crea una función DividePorCero.
// Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException
// que será capturada por su llamante (desde "main", por ejemplo).
// Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
// Finalmente, mostraremos en cualquier caso: "Demo de código".


public class EjercicioSiete {

    public static void main(String[] args) {

        try{
            System.out.println(dividePorCero(8,0));
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Demo de código");
        }

        try{
            System.out.println(dividePorCero(8,2));
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Demo de código");
        }

    }

    public static int dividePorCero(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Esto no puede hacerse");
        }else{
            return a / b;
        }
    }

}


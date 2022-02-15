package com.example;

import java.util.Vector;

// Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si
// tuviésemos 1000 elementos para ser añadidos al mismo.

// Respuesta: El problema es que se genera un costo computacional innecesario, debido a que
// con la capacidad por defecto del vector (10) se van a realizar muchos resizes para añadir los 1000 elementos.
// Podríamos evitarlo asignando al vector una una capacidad inicial igual (o ligeramente mayor) al número
// de elemementos que ya sabemos que vamos a añadir.


public class EjercicioCuatro<integer> {

    Vector<integer> vectorDos = new Vector(1000);

}

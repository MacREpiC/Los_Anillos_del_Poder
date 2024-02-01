package org.iesalandalus.programacion.clasesinteresantes.tp04.arrays;

import org.iesalandalus.programacion.clasesinteresantes.tp04.arrays.modelo.Batalla;
import org.iesalandalus.programacion.clasesinteresantes.tp04.arrays.vista.Consola;

public class Main {

    public static void main(String[] args) {
        int numeroIntegrantes = Consola.leerNumeroIntegrantes();

        Batalla batalla = new Batalla(numeroIntegrantes);

        System.out.println();//Salto de línea
        System.out.println(batalla.getResultado());
        System.out.println(batalla.toString());
    }
}


package org.iesalandalus.programacion.clasesinteresantes.tp04.arrays.modelo;

import java.util.Arrays;
import java.util.Random;

public class EjercitoBien {
    private final RazaBondadosa[] integrantes;
    private final Random generador;

    // Constructor
    public EjercitoBien(int numeroIntegrantes) {
        if (numeroIntegrantes <= 0) {
            throw new IllegalArgumentException("El número de integrantes debe ser mayor que cero.");
        }

        this.generador = new Random();
        this.integrantes = new RazaBondadosa[numeroIntegrantes];
        for (int i = 0; i < integrantes.length; i++) {
            integrantes[i] = RazaBondadosa.values()[generador.nextInt(RazaBondadosa.values().length)];
        }
    }
    public int getValentia() {
        int sumaValentias = 0;
        for (RazaBondadosa integrante : integrantes) {
            sumaValentias += integrante.getValentia();
        }
        return sumaValentias;
    }

    @Override
    public String toString() {
        return Arrays.toString(integrantes);
    }
}

package org.iesalandalus.programacion.clasesinteresantes.tp04.arrays.modelo;

import java.util.Arrays;
import java.util.Random;

public class EjercitoMal {
    private final RazaMalvada[] integrantes;
    private final Random generador;

    // Constructor
    public EjercitoMal(int numeroIntegrantes) {
        if (numeroIntegrantes <= 0) {
            throw new IllegalArgumentException("El número de integrantes debe ser mayor que cero.");
        }

        this.generador = new Random();
        this.integrantes = new RazaMalvada[numeroIntegrantes];
        //Inicializa el ejército
        for (int i = 0; i < integrantes.length; i++) {
            integrantes[i] = RazaMalvada.values()[generador.nextInt(RazaBondadosa.values().length)];
        }
    }

    public int getValentia() {
        int sumaValentias = 0;
        for (RazaMalvada integrante : integrantes) {
            sumaValentias += integrante.getValentia();
        }
        return sumaValentias;
    }

    @Override
    public String toString() {
        return Arrays.toString(integrantes);
    }
}

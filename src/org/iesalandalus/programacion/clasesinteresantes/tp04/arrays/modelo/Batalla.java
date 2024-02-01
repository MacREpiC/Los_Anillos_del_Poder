package org.iesalandalus.programacion.clasesinteresantes.tp04.arrays.modelo;

public class Batalla {
    private final EjercitoBien ejercitoBien;
    private final EjercitoMal ejercitoMal;

    public Batalla(int numeroIntegrantes) {
        this.ejercitoBien = new EjercitoBien(numeroIntegrantes);
        this.ejercitoMal = new EjercitoMal(numeroIntegrantes);
    }                                                  

    public String getResultado() {
        int valentiaBien = ejercitoBien.getValentia();
        int valentiaMal = ejercitoMal.getValentia();

        if (valentiaBien > valentiaMal) {
            return "El resultado de la batalla es: Gana el bien.";
        } else if (valentiaMal > valentiaBien) {
            return "El resultado de la batalla es: Gana el mal.";
        } else {
            return "El resultado de la batalla es: Empate.";
        }
    }

    @Override
    public String toString() {
        return "Ejército Bien:\n" + ejercitoBien.toString() + "\nEjército Mal:\n" + ejercitoMal.toString();
    }
}

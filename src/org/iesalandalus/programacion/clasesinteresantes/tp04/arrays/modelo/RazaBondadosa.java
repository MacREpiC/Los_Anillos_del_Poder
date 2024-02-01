package org.iesalandalus.programacion.clasesinteresantes.tp04.arrays.modelo;

public enum RazaBondadosa {
    PELOSO("Peloso", 1),
    SURENO_BUENO("Sureño Bueno", 2),
    ENANO("Enano", 3),
    NUMENOREANO("Númenóreano", 4),
    ELFO("Elfo", 5);
    private final String nombre;
    private final int valentia;

    RazaBondadosa(String nombre, int valentia) {
        this.nombre = nombre;
        this.valentia = valentia;
    }

    public int getValentia() {
        return valentia;
    }

    @Override
    public String toString() {
        return nombre;
    }
}

package org.iesalandalus.programacion.clasesinteresantes.tp04.arrays.modelo;

public enum RazaMalvada {
    SURENO_MALO("Sureño Malo", 2),
    ORCO("Orco", 2),
    GOBLIN("Goblin", 2),
    HUNGARO("Hungaro", 3),
    TROLL("Troll", 5);

    private final String nombre;
    private final int valentia;

    // Constructor
    RazaMalvada(String nombre, int valentia) {
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

package org.iesalandalus.programacion.clasesinteresantes.tp04.arrays.vista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Consola {

    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    // Private constructor to prevent instantiation
    private Consola() {
    }

    // Method to read the number of integrantes from the console
    public static int leerNumeroIntegrantes() {
        int numeroIntegrantes = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Ingrese el número de integrantes (debe ser mayor que cero): ");
                String input = reader.readLine();
                numeroIntegrantes = Integer.parseInt(input);

                if (numeroIntegrantes > 0) {
                    validInput = true;
                } else {
                    System.out.println("Por favor, ingrese un número mayor que cero.");
                }
            } catch (IOException | NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
            }
        }
        return numeroIntegrantes;
    }
}

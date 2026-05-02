package com.krakedev.figuras;

public class Graficador {
    
    // Creamos un metodo graficar
    public void graficar(Figuras figura) {
        // Accedemos a los atributos mediante los getters de la clase Figura
        System.out.println("Graficando " + figura.getNombre() + " de color " + figura.getColor());
    }
}
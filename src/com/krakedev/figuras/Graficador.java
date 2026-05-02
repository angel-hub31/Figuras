package com.krakedev.figuras;

public class Graficador  {
    
    // Creamos un metodo graficar
    public void graficar(Figuras figura) {
        // Accedemos a los atributos mediante los getters de la clase Figura
    	figura.calcularPerimetro();
    }
}
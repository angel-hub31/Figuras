package com.krakedev.figuras;

public class Graficador  {
    
    // Creamos un metodo graficar
    public void graficar(Figuras figura) {
        // Accedemos a los atributos mediante los getters de la clase Figura
       //System.out.println("Graficando " + figura.getNombre() + " de color " + figura.getColor());
    	//figura.calcularPerimetro();
    	System.out.println("Nombre: " + figura.getNombre());    
    	System.out.println("Color: " +figura.getColor());
    	System.out.println("Perimetro: " + figura.calcularPerimetro());
    	System.out.println("Area: " +  figura.calcularArea());
    	System.out.println();
    }
}

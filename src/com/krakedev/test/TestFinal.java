package com.krakedev.test;

import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.TrianguloRectangulo;

public class TestFinal {

	public static void main(String[] args) {
		
		Graficador g = new Graficador();

        // Instanciamos la nueva figura especializada
        TrianguloRectangulo tr = new TrianguloRectangulo("TrianguloRectangulo","Verde",4, 3, 5);

        // Verificamos el polimorfismo: funciona con Graficador aunque sea una clase nueva
        g.graficar(tr);
    
	}

}

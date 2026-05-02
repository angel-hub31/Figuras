package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Rectangulo;

public class TestPerimetro {

	public static void main(String[] args) {
		
		Cuadrado c=new Cuadrado();
		Rectangulo r=new Rectangulo();
		
		int perimetroC=c.calcularPerimetro();
		int perimetroR=r.calcularPerimetro();
		
		System.out.println("Perimetro cuadrado: "+ perimetroC);

		System.out.println("Perimetro rectangulo: " + perimetroR);

	}

}

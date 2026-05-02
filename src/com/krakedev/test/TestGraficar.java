package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figuras;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Rectangulo;
import com.krakedev.figuras.Triangulo;

public class TestGraficar {

	public static void main(String[] args) {
		// instanciamos los objetos 
		Graficador g= new Graficador();
		
		Figuras f = new Figuras("Circulo","Blanco");
		
		Cuadrado c=new Cuadrado("Cuadrado","Azul",8);
		
		Triangulo t=new Triangulo("Triangulo","Amarillo",6,5);
		
		Rectangulo r=new Rectangulo("Rectangulo","Rojo",10,5);
		
		System.out.println(f);
		System.out.println(c);
		System.out.println(t);
		System.out.println(r);
		

	}

}

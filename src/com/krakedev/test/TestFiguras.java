package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figuras;
import com.krakedev.figuras.Triangulo;

public class TestFiguras {

	public static void main(String[] args) {
		//instanciamos los objetos
		Figuras f=new Figuras();
		f.setNombre("Circulo");
		f.setColor("Blanco");
		
		Cuadrado c=new Cuadrado();
		c.setNombre("Cuadrado");
		c.setColor("Azul");
		
		Triangulo t=new Triangulo();
		t.setNombre("Triangulo");
		t.setColor("Amarillo");
		
		System.out.println(f);
		System.out.println(c);
		System.out.println(t);
		
	}

}

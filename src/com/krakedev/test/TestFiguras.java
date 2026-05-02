package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figuras;
import com.krakedev.figuras.Triangulo;

public class TestFiguras {

	public static void main(String[] args) {
		//instanciamos los objetos
		//despues de corregir errores en las clses
		//ahora podemos pasar directamente las descripciones en cada objeto
		Figuras f=new Figuras("Circulo","Blanco");
		
		Cuadrado c=new Cuadrado("Cuadrado","Azul");
		
		
		Triangulo t=new Triangulo("Triangulo","Amarillo");
		
		
		System.out.println(f);
		System.out.println(c);
		System.out.println(t);
		
	}

}

package com.krakedev.test;

import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Hexagono;

public class TestExagono {

	public static void main(String[] args) {
		Graficador gd=new Graficador();
		
		Hexagono hx=new Hexagono("Hexagono","Rojo",5);
		gd.graficar(hx);
		
	}

}

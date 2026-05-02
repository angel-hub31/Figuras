package com.krakedev.figuras;

public class Cuadrado extends Figuras {
	//creamos un atributo
	private int lado;
	
	//constructor, ahora recibe el atributo int lado
	public Cuadrado(String nombre, String color, int lado) {
// usamos super para invocar al constructor padre
		super(nombre,color);
		this.lado=lado;
	}
	
	@Override
	//creamos metodo calcularPerimetro
	public int calcularPerimetro() {
		return 4*lado;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	

	
	
	
}

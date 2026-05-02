package com.krakedev.figuras;

public class Triangulo extends Figuras{
	
	private int base;
	private int altura;
	
	//constructor para no generar error
	public Triangulo(String nombre, String color,int base,int altura) {
// usamos super para invocar al constructor padre
		super(nombre,color);
		this.base=base;
		this.altura=altura;
	}
	
	@Override
	public double calcularArea() {
	    return (double) (base * altura) / 2;
	}

}

package com.krakedev.figuras;

public class Figuras {
	// atributos privados
	private String nombre;
	private String color;

//constructor con parametros
	public Figuras(String nombre, String color) {

		this.nombre = nombre;
		this.color = color;
	}

//constructor sin parametros o vacio
	public Figuras() {

	}

// creacion de metodos getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// sobreescritura del metodo toString
	@Override
	public String toString() {
		return "Figuras: nombre=" + nombre + ", color=" + color;
	}
	
	
	public int calcularPerimetro() {
		return 0;
	}

}

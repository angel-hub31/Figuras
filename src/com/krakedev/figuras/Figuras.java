package com.krakedev.figuras;

public class Figuras {
	//atributos privados 
	private String nombre;
	private String color;

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
		return "Figuras [nombre=" + nombre + ", color=" + color + "]";
	}
	
	
	
	

}

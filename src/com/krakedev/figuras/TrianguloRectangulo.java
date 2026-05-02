package com.krakedev.figuras;

public class TrianguloRectangulo extends Figuras {
	private int catetoA;
	private int catetoB;
	private double hipotenusa;
	
	
	
	public TrianguloRectangulo(String nombre,String color,int catetoA, int catetoB, double hipotenusa) {
		super(nombre,color);
		this.catetoA = catetoA;
		this.catetoB = catetoB;
		this.hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
	}
	@Override
	//creamos metodo calcularPerimetro
	public int calcularPerimetro() {
		return (int) (catetoA +catetoB + hipotenusa);
	}
	@Override
	public double calcularArea() {
		return (double) (catetoA* catetoB)/2;
	}

	public int getCatetoA() {
		return catetoA;
	}
	public void setCatetoA(int catetoA) {
		this.catetoA = catetoA;
	}
	public int getCatetoB() {
		return catetoB;
	}
	public void setCatetoB(int catetoB) {
		this.catetoB = catetoB;
	}

	
	

}

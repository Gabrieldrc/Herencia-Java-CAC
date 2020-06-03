package Practica.src.models;

public abstract class Figura2D extends Figura{
	public Figura2D(){}
	public Figura2D(final String nombre, final int grosorBorde, final int color) 
	{
		this.nombre= nombre;
		this.grosorBorde = grosorBorde;
		this.color = color;
	}
	
	public abstract double calcularArea();
	public abstract double calcularPerimetro();
}
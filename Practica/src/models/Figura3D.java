package Practica.src.models;

public abstract class Figura3D extends Figura{
	public Figura3D(){}
	public Figura3D(String nombre, int grosorBorde, int color) 
	{
		this.nombre= nombre;
		this.grosorBorde = grosorBorde;
		this.color = color;
	}
	
	abstract double calcularVolumen();
}
package Practica.src.models;

public abstract class Figura {
	String nombre;
	int grosorBorde;
	int color;
	public Figura() {}
	public Figura(String nombre, int grosorBorde, int color) 
	{
		this.nombre = nombre;
		this.grosorBorde = grosorBorde;
		this.color = color;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	public String getNombre()
	{
		return this.nombre;
	}
	public void setGrosorBorde(int grosorBorde)
	{
		this.grosorBorde = grosorBorde;
	}
	public int getGrosorBorde()
	{
		return this.grosorBorde;
	}
	public void setColor(int color)
	{
		this.color = color;
	}
	public int getColor()
	{
		return this.color;
	}
	abstract void dibujar();
}
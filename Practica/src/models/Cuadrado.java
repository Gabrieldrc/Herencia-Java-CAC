package Practica.src.models;

public class Cuadrado extends Figura2D{
	int lado;
	public Cuadrado() {}
	public Cuadrado(String nombre, int grosorBorde, int color, int lado)
	{
		this.nombre = nombre;
		this.grosorBorde = grosorBorde;
		this.color = color;
		this.lado = lado;
	}
	
	public void setLado(int lado)
	{
		this.lado = lado;
	}
	
	public int getLado()
	{
		return this.lado;
	}
	
	@Override
	public double calcularArea() {
		return this.lado * this.lado;
	}
	@Override
	public double calcularPerimetro() {
		return this.lado * 4;
	}
	@Override
	void dibujar() {
		System.out.println(this.nombre);
	}
}
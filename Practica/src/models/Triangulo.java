package Practica.src.models;

public class Triangulo extends Figura2D{
	int base;
	int altura;
	public Triangulo() {}
	public Triangulo(String nombre, int grosorBorde, int color, int base, int altura)
	{
		this.nombre = nombre;
		this.grosorBorde = grosorBorde;
		this.color = color;
		this.base = base;
		this.altura = altura;
	}
	
	public void setBase(int base)
	{
		this.base = base;
	}
	
	public void setAltura(int altura)
	{
		this.altura = altura;
	}
	
	public int getBase()
	{
		return this.base;
	}
	
	public int getAltura()
	{
		return this.altura;
	}
	
	@Override
	public double calcularArea() {
		return (this.base * this.altura) / 2;
	}
	@Override
	public double calcularPerimetro() {
		return this.base * 3;
	}
	@Override
	void dibujar() {
		System.out.println(this.nombre);
	}

}
package Practica.src.models;

public class Circulo extends Figura2D{
	int radio;
	public Circulo() {}
	public Circulo(String nombre, int grosorBorde, int color, int radio)
	{
		this.nombre = nombre;
		this.grosorBorde = grosorBorde;
		this.color = color;
		this.radio = radio;
	}
	
	public void setRadio(int radio)
	{
		this.radio = radio;
	}
	
	public int getRadio()
	{
		return this.radio;
	}
	
	@Override
	public double calcularArea() {
		return Math.PI * Math.sqrt(this.radio);
	}
	@Override
	public double calcularPerimetro() {
		return Math.PI*2*this.radio;
	}
	@Override
	void dibujar() {
		System.out.println(this.nombre);
	}
}
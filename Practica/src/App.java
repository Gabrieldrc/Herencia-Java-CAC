package Practica.src;
import Practica.src.models.*;

public class App {
    public static void main(String[] args) throws Exception {
        Circulo circulo = new Circulo();
        circulo.setRadio(5);
        System.out.println(circulo.calcularArea());
    }
}

package exercicio_2;

import java.lang.Math;
public class AreasGeometricas {
	
	private double pi = 3.14159;
	
	public void circulo(double raio) {
		double area = this.pi * Math.pow(raio, 2);
		System.out.printf("Circulo = %.3f %n", area);
	}
	
	public void trianguloRetangulo(double base, double altura) {
		double area = (base * altura)/2;
		System.out.printf("Triangulo = %.3f %n",area);
	}
	
	public void trapezio (double baseMaior, double baseMenor, double altura) {
		double area = ((baseMenor+baseMaior)*altura)/2;
		System.out.printf("Trapezio = %.3f %n",area);
	
	}
	
	public void quadrado(double medidaLado) {
		double area = medidaLado * medidaLado;
		System.out.printf("Quadrado = %.3f %n",area);
	}
	
	public void retangulo(double base, double altura) {
		double area = base * altura;
		System.out.printf("Retangulo = %.3f %n",area);
	}
}

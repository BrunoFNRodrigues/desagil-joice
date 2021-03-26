package br.edu.insper.desagil.joice.model;

public class CalculadoraCFC extends Calculadora {
	public CalculadoraCFC() {
		super("CFC");
	}
	
	
	public double calcula(double peso, double raio) {
		double Ma = (4*peso)/(6.023*Math.pow(10, 23));
		raio = raio*Math.pow(10, -7);
		double area1 = Math.pow(4*raio, 2)/2;
		double area2 = Math.sqrt(area1);
		double volume = Math.pow(area2, 3);
		return Ma/volume;
		
		
	}
	

}

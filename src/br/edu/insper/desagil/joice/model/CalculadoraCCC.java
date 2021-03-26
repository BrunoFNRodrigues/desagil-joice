package br.edu.insper.desagil.joice.model;

public class CalculadoraCCC extends Calculadora {
	
	public CalculadoraCCC(){
		super("CCC");
	}
	
	
	public double calcula(double peso, double raio) {
		raio = raio*Math.pow(10, -7);
		double volume = Math.pow((4*raio/Math.sqrt(3)),3);
		double avogadro = 6.023*Math.pow(10,23);
		double densidade = peso*2/(avogadro*volume);
		return densidade;
	}
}

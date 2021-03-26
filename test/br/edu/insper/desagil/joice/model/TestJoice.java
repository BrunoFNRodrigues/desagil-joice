package br.edu.insper.desagil.joice.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestJoice {
	private double rCu;
	private double rAu;
	private double rAg;
	private double pCu;
	private double pAu;
	private double pAg;
	private static double DELTA = 0.05;
	//private CalculadoraCCC cCCC;
	private CalculadoraCFC cCFC;

	@BeforeEach
	public void setUp(){
		rCu = 0.128;
		rAu = 0.144;
		rAg = 0.144;
		pCu = 63.55;
		pAu = 196.97; 
		pAg = 107.87;
		cCFC = new CalculadoraCFC("CFC");
	}
	
	
	@Test
	public void test2() {
		assertEquals(8.89, cCFC.calcula(pCu ,rCu), DELTA);
	}
	
	@Test
	public void test4() {
		assertEquals(19.36, cCFC.calcula(pAu ,rAu), DELTA);
	}
	
	@Test
	public void test6() {
		assertEquals(10.60, cCFC.calcula(pAg ,rAg), DELTA);
	}

}

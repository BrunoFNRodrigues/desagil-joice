package br.edu.insper.desagil.joice.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestJoice {
	private double rNb;
	private double rTg;
	private double rLi;
	private double pNb;
	private double pTg;
	private double pLi;
	private static double DELTA = 0.05;
	private CalculadoraCCC cCCC;

	@BeforeEach
	public void setUp(){
		rNb = 0.143;
		rTg = 0.137;
		rLi = 0.152;
		pNb = 92.91;
		pTg = 183.84;
		pLi = 6.94;
		cCCC = new CalculadoraCCC("CCC"); 
	}
	
	
	@Test
	public void test1() {
		assertEquals(8.57,cCCC.calcula(pNb,rNb),DELTA);
	}
	
	@Test
	public void test3() {
		assertEquals(19.28,cCCC.calcula(pTg,rTg),DELTA);
	}
	
	@Test
	public void test5() {
		assertEquals(0.53,cCCC.calcula(pLi,rLi),DELTA);
	}

}

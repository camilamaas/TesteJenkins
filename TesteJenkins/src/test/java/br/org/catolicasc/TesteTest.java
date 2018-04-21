package br.org.catolicasc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TesteTest {

	@Test
	public void teste1() {
		assertTrue(true);
	}
	
	@Test 
	public void calculaSucesso() {
		assertEquals(2, calcula(1,1));
	}
	
	@Test 
	public void calculaErro() {
		assertNotEquals(1, calcula(1,1));
	}
	
	public int calcula(int valor1, int valor2 ) {
		return valor1+valor2; 
	}
}

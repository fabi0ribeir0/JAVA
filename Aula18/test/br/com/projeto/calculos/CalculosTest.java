package br.com.projeto.calculos;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class CalculosTest {
	
	private final Calculos calculos = new Calculos();
	
	@Test
	public void somarDoisNUmerosTest() {
		
		assertTrue(2.0 == calculos.somarDoisNumeros(1.0, 1.0));		
	}
	
	@Test
	public void subtrairDoisNumerosTest() {
		assertTrue(7.0 == calculos.subtrairDoisNumeros(9.0, 2.0) );
	}

}

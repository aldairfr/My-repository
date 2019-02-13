package calculadora;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;


import org.junit.BeforeClass;
import org.junit.Test;


public class TablaEnterosTest {

	
	private static TablaEnteros tablaEnteros;
	
	@BeforeClass
	public static void stUpBeforeClass() throws Exception{
		Integer[] iniTabla = {1,2,3};
		tablaEnteros = new TablaEnteros(iniTabla);
	}
	
	/* ***************PRUEBAS*****************/
	
	@Test
	public void testSumaTabla() {
		int resultado = tablaEnteros.sumaTabla();
		assertEquals(6,resultado);
	}
	
	@Test
	public void testMayorTabla() {
		int max = tablaEnteros.mayorTabla();
		assertEquals(3,max);
	}
	
/*
	
	@Test (expected = java.util.NoSuchElementException)
	public void testPosicionTabla() {
		
	}

	@Test (expected = IllegalArgumentException)
	public void testConstructor() {
		
	}

*/

}

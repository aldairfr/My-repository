package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSuma() {
		Calculadora calcu= new Calculadora(20,10);
		int resultado = calcu.suma();
		assertEquals(30,resultado);
	}

	@Test
	public void testResta() {
		
		Calculadora calcu= new Calculadora(20,10);
		int resultado = calcu.resta();
		assertEquals(10,resultado);
			
	}

	@Test
	public void testMultiplica() {
		Calculadora calcu= new Calculadora(20,10);
		int resultado = calcu.multiplica();
		assertEquals(200,resultado);
	}

	@Test
	public void testDivide() {
		try {
			Calculadora calcu= new Calculadora(20,0);
			int resultado = calcu.divide0();
			assertEquals(2,resultado);
			fail("FALLO, Debería haber lanzado la excepción.");
		}catch (ArithmeticException e) {
			System.out.println("Prueba SATISFACTORIA");
		}
			
	}
	
	@Test(expected = java.lang.ArithmeticException.class)
	public void testDivide0() {
		Calculadora calcu= new Calculadora(20,2);
		Integer resultado=calcu.divide0();
	}
	

}

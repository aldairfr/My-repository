package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class EjercicioJUNITTest {
	
	@Test
	public void testResta() {
		EjercicioJUNIT calcu = new EjercicioJUNIT(20,10);
		int resultado = calcu.resta();
		assertEquals(10,resultado);
	}

	@Test
	public void testResta2() {
		EjercicioJUNIT calcu = new EjercicioJUNIT(20,10);
		boolean resultado = calcu.resta2();
		assertEquals(true,resultado);
	}
	
	@Test
	public void testDivide2() {
		EjercicioJUNIT calcu = new EjercicioJUNIT(20,0);
		Integer resultado = calcu.divide2();
		assertNull(null,resultado);
	}
}

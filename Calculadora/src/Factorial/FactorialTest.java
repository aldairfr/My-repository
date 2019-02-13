package Factorial;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testCalculoMenor() {
		int result= Factorial.Calculo(-5);
	}
	
	@Test
	public void testCalculoFactorial() {
		int result = Factorial.Calculo(3);
		assertEquals(6,result);
		
	}
	
	@Test(expected = java.lang.ArithmeticException.class)
	public void testCalculoCero() {
		int result = Factorial.Calculo(0);
	}

}

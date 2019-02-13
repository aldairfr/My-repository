package parametrizadas;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

//To use Parameterized.class :
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculadoraTestParamSuma {

	private int num1;
	private int num2;
	private int result;

	public CalculadoraTestParamSuma(int num1, int num2, int result) {
		this.num1 = num1;
		this.num2 = num2;
		this.result = result;
	}

	@Parameters
	public static  Collection<Object[]> numeros() {
		return Arrays.asList(new Object[][] { { 20, 10, 100 }, { 40, 20, 60 }, { 1, 1, 2 } });
	}

	@Test
	public void testSuma() {
		calculadora calcu = new calculadora(num1, num2);
		int resultado = calcu.suma();
		assertEquals(result, resultado);
	}

}

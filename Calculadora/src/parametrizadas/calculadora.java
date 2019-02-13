package parametrizadas;

public class calculadora {
	private int num1;
	private int num2;
	
	public calculadora(int a, int b) {
		num1=a;
		num2=b;
	}
	
	public int suma() {
		int resultado = num1 + num2;
		return resultado;
	}
	public int resta() {
		int resultado = num1 - num2;
		return resultado;
	}
	public int multiplica(){
		int resultado = num1 * num2;
		return resultado;
	}

}

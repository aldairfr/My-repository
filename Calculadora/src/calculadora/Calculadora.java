package calculadora;

public class Calculadora {
	private int num1;
	private int num2;
	
	public Calculadora (int a, int b){
		num1=a;
		num2=b;
	}
	
	public int suma() {
		int result = num1 + num2;
		return result;
	}
	public int resta() {
		int result = num1 - num2;
		return result;
	}
	public int multiplica(){
		int result = num1 * num2;
		return result;
	}
	public int divide0(){
		
		if(num2 == 0) {
			throw new java.lang.ArithmeticException("Divisi�n por 0");
		}else {
			int result = num1 / num2;
			return result;
		}
	}
}

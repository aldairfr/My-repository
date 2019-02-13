package calculadora;

public class EjercicioJUNIT {
		
	private int num1;
	private int num2;
	
	public EjercicioJUNIT (int a, int b){
		num1=a;
		num2=b;
	}
	
	public int resta() {
		int result;
		if(resta2() )
			result = num1 - num2;
		else
			result = num2 -num1;
		
		return result;
	}
	
	public boolean resta2() {
		if (num1 >= num2) return true;
		else return false;
	}
	
	public Integer divide2() {
		if(num2==0) return null;
		int result = num1 / num2;
		return(result);
	}
}

package test;

public class Calculator_test {

	public static void main(String[] args) {
		Calculator calculator = new Calculator(); // calculator °´Ã¼ »ý¼º
		
		int a = 5, b = 3;

		System.out.print(a + " + " + b + " = ");
		calculator.calculate(a, '+', b);

		System.out.print(a + " - " + b + " = ");
		calculator.calculate(a, '-', b);
		
		System.out.print(a + " * " + b + " = ");
		calculator.calculate(a, '*', b);
	}
}



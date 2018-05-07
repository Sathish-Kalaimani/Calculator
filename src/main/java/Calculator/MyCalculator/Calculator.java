package Calculator.MyCalculator;

import java.util.Scanner;

public class Calculator{
	
	static double result =0;
	
	public static double calculate(double a, double b, String operator) {
		
		switch(operator) {
		
		case "+":	result = a + b;
					break;
		case "-": 	result = a - b;
					break;
		case "*":  	result = a * b;
					break;
		default: result = 0.00;
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the First Number:");
		double a = scan.nextDouble();
		System.out.println("Enter the Second Number:");
		double b = scan.nextDouble();
		System.out.println("What Do you want to do with these numbers?");
		String op = scan.next();
		
		double result = calculate(a,b,op);
		scan.close();
		System.out.println("The result of the operation is "+result);
		
	}
	
   
}

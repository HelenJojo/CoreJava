package stringwrappers;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		double n1,n2;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the numbers");
		n1= in.nextDouble();
		n2=in.nextDouble();
		
		System.out.println("Enter the operation to be performed: (+,-,*,/)");
		
		char op= in.next().charAt(0);
		
		double result=0;
		switch(op) {
		 
		case '+':
			result= n1+n2;
			break;
		case '-':
			result=n1-n2;
			break;
			
		case '*':
			result=n1*n2;
			break;
		case '/':
			result=n1/n2;
			break;
		default:
			System.out.println("Enter a valid operator");
			break;
		}
		System.out.println("Result: "+n1+" "+op+" "+n2+" = "+result);

	}

}

package exceptions;

import java.util.Scanner;

class SomeClass {
	int a,b;
	public SomeClass(int a, int b) throws Exception{
		throw new Exception("Exception occured!");
	}
}

public class ConstructorFailure {

	public static void main(String[] args)throws Exception {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the 1st no:");
		int a= in.nextInt();
		
		System.out.println();
		
		System.out.print("Enter the 2nd no:");
		int b= in.nextInt();
		
		
		SomeClass test;
		try {
			test = new SomeClass(a,b);
		}
		catch(Exception e) {
			System.out.println("Exception Caught "+e.getMessage());
		}
	}

}

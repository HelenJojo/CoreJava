package stringwrappers;

import java.util.Scanner;

public class VowelCount {

	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String of ur choice");
		String str = in.nextLine();
		
		
		char [] array= str.toCharArray();
		int count=0;
		for(int i=0; i<str.length();i++) {
			if (str.charAt(i)=='A' || str.charAt(i)=='E' ||str.charAt(i)=='I' ||str.charAt(i)=='O'
					||str.charAt(i)=='U' ||str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' 
					||str.charAt(i)=='o' ||str.charAt(i)=='u'){
				
						count++;
			}
		}
		System.out.println("Count of vowels in the string : "+count);

	}

}

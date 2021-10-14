package stringwrappers;

import java.util.Scanner;

public class MiddleCharacter {

	public static String findMiddle(String str) {
	
		int length,index;
		if (str.length()%2==0) {
			index = str.length()/2 -1;
			length=2;
			
		}else {
			index=str.length()/2;
			length=1;
		}
		return str.substring(index, index+length);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter string of ur choice ");
		String str=in.nextLine();
		
		System.out.println("Middle Character : "+findMiddle(str));
		

	}

}

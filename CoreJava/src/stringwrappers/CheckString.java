package stringwrappers;

import java.util.Scanner;

public class CheckString {

	public static int checkCharacters(String str) {
		int n = str.length();
		if (n < 2) {
			return -1;
		}
		if (str.charAt(0) == str.charAt(n - 1)) {
			return 1;
		} else
			return 0;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter a string of ur choice ");
		String str = in.nextLine();
		int result = checkCharacters(str);
		if (result == 1) {
			System.out.print("Valid");
		}
		else
			System.out.print("Invalid");
	}

}

package strings;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string:");
		String string=scanner.next();
		String str=string.toLowerCase();

		boolean rs=isPalindrome(str);
		if(rs)
			System.out.println("The given String is Palindrome");
		else
			System.out.println("The given String is not a palindrome");
	}

	private static boolean isPalindrome(String str) {

		String string="";

		for(int i=str.length()-1;i>=0;i--) {
			string+=str.charAt(i);

		}	
		return str.equals(string);
	}
}

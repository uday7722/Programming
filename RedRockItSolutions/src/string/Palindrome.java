package string;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		String str=scanner.next();
		
		boolean rs=checkPalindrome(str);
		if(rs)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");		
	}

	private static boolean checkPalindrome(String str) {
		
		String temp="";
		for(int i=str.length()-1;i>=0;i--) {
			temp+=str.charAt(i);
		}
		
		return str.equals(temp);	
		
	}

}

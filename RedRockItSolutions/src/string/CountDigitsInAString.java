package string;

import java.util.Scanner;

public class CountDigitsInAString {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str=scanner.next();

		int count=countDigits(str);
		System.out.println(count);	
	}

	private static int countDigits(String str) {

		int count=0;

		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch))

				count++;
		}

		return count;


	}
}

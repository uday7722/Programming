package strings;

import java.util.Scanner;

public class DigitsPresentInString {
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scanner.next();

		int count=countDigits(str);

		System.out.println("No of digits present in the string: "+count);

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

package strings;

import java.util.Scanner;

public class SumOfDigitsInAString {
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string with digits");
		String str=scanner.next();

		int sum=sumOfDigits(str);
		System.out.println("Sum of the string is "+sum);
	}

	private static int sumOfDigits(String str) {

		int sum=0;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);

			if(Character.isDigit(ch))
				sum+=Character.getNumericValue(ch);
		}
		return sum;
	}
}

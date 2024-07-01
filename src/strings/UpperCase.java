package strings;

import java.util.Scanner;

public class UpperCase {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scanner.next();

		String upperCase=toUpperCase(str);
		System.out.println(upperCase);

	}

	private static String toUpperCase(String str) {

		String uc=str.toUpperCase();
		return uc; 



	}

}

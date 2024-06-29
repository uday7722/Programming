package strings;

import java.util.Scanner;

public class HowManySpecialCharcters {


	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string:");
		String string=scanner.next();

		int count=countSpecial(string);
		System.out.println("Count of special character is: "+count);

	}

	private static int countSpecial(String string) {
		int count=0;
		for(int i=0;i<string.length();i++) {
			char ch=string.charAt(i);

			if(!Character.isLetterOrDigit(ch))
				count++;
		}
		return count;
	}
}

package strings;

import java.util.Scanner;

public class CountIndividual {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string:");
		String string=scanner.next();

		int[] count=countIndividual(string);
		
		System.out.println("Count of special Charcter is: "+count[0]);
		System.out.println("Count of lower case is: "+count[1]);
		System.out.println("Count of capital letters is: "+count[2]);


	}

	private static int[] countIndividual(String string) {
		int countSpecail=0;
		int countlowerCase=0;
		int countCapitalLetters=0;

		for(int i=0;i<string.length();i++) {
			char ch=string.charAt(i);

			if(!Character.isLetterOrDigit(ch))
				countSpecail++;
			else if(Character.isLowerCase(ch))
				countlowerCase++;

			else
				countCapitalLetters++;	
		}

		return new int[]{countSpecail,countlowerCase,countCapitalLetters};

	}
}

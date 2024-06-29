package strings;

import java.util.Scanner;

public class CountVowelsAndConsonants {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string with digits");
		String str=scanner.next();

		int[] countVC=countOfVowelsAndConsonants(str);
		System.out.println("Vowels count is: "+countVC[0]);
		System.out.println("Consonants count is: "+countVC[1]);
		
	}

	private static int[] countOfVowelsAndConsonants(String str) {
		
		int vowelCount=0;
		int consonantsCount=0;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				vowelCount++;
			else
			 consonantsCount++;
			
		}
		return new int[] {vowelCount,consonantsCount};
	}
}

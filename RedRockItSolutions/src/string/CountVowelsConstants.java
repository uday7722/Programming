package string;

import java.util.Scanner;

public class CountVowelsConstants {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		String str=scanner.next();

		int[] count=countVowelConstant(str);
		System.out.println("No of vowels"+" "+count[0]);
		System.out.println("No of vowels"+" "+count[1]);	
	}

	private static int[] countVowelConstant(String string) {

		String str=string.toLowerCase();
		int vowelCount=0;
		int constantCount=0;

		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);

			if(ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u')
				vowelCount++;
			else
				constantCount++;
		}

		return new int[] {vowelCount,constantCount};



	}





}

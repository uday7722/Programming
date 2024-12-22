package string;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String string1=scanner.nextLine();
		String string2=scanner.nextLine();

		boolean rs=checkAnagram(string1,string2);
		if(rs)
			System.out.println("Are anagrams");
		else
			System.out.println("Not anagrams");
	}

	private static boolean checkAnagram(String string1, String string2) {

		String str1=string1.toLowerCase();
		String str2=string2.toLowerCase();

		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		return Arrays.equals(ch1, ch2);

	}

}

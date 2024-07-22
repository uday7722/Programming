package strings;

import java.util.Scanner;
import java.util.TreeSet;

public class PrintWithoutDuplicates {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any String");

		String string=scanner.next();

		printWithoutDuplicates(string);
	}

	private static void printWithoutDuplicates(String s) {
		
		String string=s.toLowerCase();

		char[] cs=string.toCharArray();

		TreeSet<Character> characters=new TreeSet<>();
		
		for(Character character:cs) {
			characters.add(character);
		}
		
		for(Character cha:characters) {
			System.out.print(cha);
		}


	}

}

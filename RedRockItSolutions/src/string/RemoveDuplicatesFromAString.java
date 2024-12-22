package string;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesFromAString {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str=scanner.next();

		Set<Character> set=new LinkedHashSet<>();

		for(int i=0;i<str.length();i++) {
			set.add(str.charAt(i));
		}

		for(char ch:set) {
			System.out.print(ch);
		}



	}

}

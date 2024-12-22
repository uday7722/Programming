package string;

import java.util.Arrays;
import java.util.Scanner;

public class SortTheString {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str=scanner.next();

		char[] ch=str.toCharArray();

		Arrays.sort(ch);

		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}


	}

}

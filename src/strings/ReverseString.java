package strings;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scanner.next();

		String revString=reverseString(str);
		System.out.println(revString);
	}

	private static String reverseString(String str) {
		char[] ch=str.toCharArray();

		int left=0;
		int right=str.length()-1;

		while(left<right) {

			char temp=ch[left];
			ch[left]=ch[right];
			ch[right]=temp;

			left++;
			right--;

		}

		return new String(ch);
	}

}

/*Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scanner.next();

		StringBuilder builder=new StringBuilder(str).reverse();
		System.out.println(builder);
 */

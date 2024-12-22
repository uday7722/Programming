package arrays;

import java.util.Scanner;

public class PalindromeArray {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();

		int[] arr=new int[size];

		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
		}

		boolean rs=checkPalindrome(arr,size);
		if(rs)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

	private static boolean checkPalindrome(int[] arr,int size) {
		int first=0;
		int last=arr.length-1;

		while(last>=first) {
			if(arr[first]!=arr[last])
				return false;

			first ++;
			last--;

		}

		return true;

	}

}

package numbers;

import java.util.Scanner;

//12321
// %--> modulus ->remainder
// / --> 

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		int num=scanner.nextInt();
		boolean rs=checkPalindrome(num);
		System.out.println(rs);
	}


	private static boolean checkPalindrome(int num) {
		int temp=num;

		int rev=0;
		while(num!=0) {

			int d=num%10;
			rev=rev*10+d;
			num=num/10;

		}
		if(temp==rev)
			return true;
		else
			return false;
	}
}

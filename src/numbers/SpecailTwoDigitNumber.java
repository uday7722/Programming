package numbers;

import java.util.Scanner;

public class SpecailTwoDigitNumber {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the two digit number");
		int num=scanner.nextInt();
		boolean rs=specialTwo(num);
		if(rs)
			System.out.println(num+" is a two special two digit number");
		else
			System.out.println(num +" is not a Special digit number");

	}

	private static boolean specialTwo(int num) {
		int a=num%10;
		int b=num/10;
		
		System.out.println(b);

		int product=a*b;
		int sum=a+b;

		if(num==product+sum)
			return true;
		else
			return false;

	}
}

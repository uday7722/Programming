package numbers;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the year");
		int year=scanner.nextInt();

		boolean rs=leapYear(year);
		if(rs)
			System.out.println(year +" is a leap Year");
		else
			System.out.println(year+" is Not a leap year");


	}

	private static boolean leapYear(int year) {

		if( (year%4==0 && year%100!=0) || (year%400==0))
			return true;
		else
			return false; 
	}

}

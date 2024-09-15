package numbers;

import java.time.YearMonth;
import java.util.Scanner;

public class CountDaysOfAMonth {
	

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the month:");
		int month=scanner.nextInt();
		
		System.out.println("Emter the year:");
		int year=scanner.nextInt();
		
		
		YearMonth yearMonth=YearMonth.of(year, month);
		
		int noOfDays=yearMonth.lengthOfMonth();
		
		System.out.println("Number of days in month "+ month +" is "+ noOfDays);
				
	}
		

}

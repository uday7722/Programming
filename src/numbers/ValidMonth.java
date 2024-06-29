
package numbers;

import java.time.YearMonth;
import java.util.Scanner;

public class ValidMonth {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the month:");
		int month=scanner.nextInt();
		System.out.println("Enter the year");
		int year=scanner.nextInt();

		boolean rs=validMonth(month);
		if(rs) {
			System.out.println("The given month is valid");
			YearMonth yearMonth=YearMonth.of(year, month);
			System.out.println("No of days in given month is "+yearMonth.lengthOfMonth());

		}

		else
			System.out.println("The given month is not valid");

	}

	public static boolean validMonth(int month) {
		if(month<=12 && month>1)
			return true;

		else
			return false;
	}

}

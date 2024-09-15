package numbers;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class PrintMonthNumber {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int monthNum=scanner.nextInt();
		
		Month month=Month.of(monthNum);
		
		String monthName=month.getDisplayName(TextStyle.FULL, Locale.US);
	
		System.out.println(monthName);
		
		

	}
}

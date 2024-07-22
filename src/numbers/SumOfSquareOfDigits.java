package numbers;

import java.util.Scanner;

public class SumOfSquareOfDigits {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scanner.nextInt();
		int number=num;
	
		int sum=0;
		do {
			
			int a=num%10;
			sum=sum+a*a*a;
			num=num/10;
			
		} while (num!=0);
		if(number==sum)
			System.out.println(" armstrong");
		else
		System.out.println("Not armstrong");
		
	}
}

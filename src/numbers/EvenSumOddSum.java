package numbers;

import java.util.Scanner;

public class EvenSumOddSum {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scanner.nextInt();
		
		int oddSum=0;
		int evenSum=0;
		
		for(int i=0;i<=num;i++) {
			if(i%2==0)
				evenSum+=i;
			else
				oddSum+=i;
		}
		
		System.out.println(evenSum+" "+oddSum);
		
	}

}

package numbers;

import java.util.Scanner;

public class FactorailNumber {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scanner.nextInt();
		
		int sum=1;
		for(int i=1;i<=num;i++) {
			sum=sum*i;
			
		}
		System.out.println(sum);
		
	}

}

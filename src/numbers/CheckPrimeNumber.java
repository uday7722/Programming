package numbers;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any num");
		int num=scanner.nextInt();
		boolean rs=checkPrime(num);
		if(rs)
			System.out.println("The given num is prime number");
		else
			System.out.println("The given num is not prime number ");

	}

	private static boolean checkPrime(int num) {
		int count=0;
		
			for(int i=2;i<=num;i++) {
				if(num%i==0)
					count ++;
			}
		if(count>2)
			return false;
		else
			return true;

	}

}

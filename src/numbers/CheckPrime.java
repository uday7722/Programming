package numbers;

import java.util.Scanner;

public class CheckPrime {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scanner.nextInt();
		
		boolean rs=checkPrime(num);
		if(rs)
			System.out.println("the given num is prime");
		else
		System.out.println("the given num is not prime");
		
	}

	private static boolean checkPrime(int num) {
		
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				count ++;
			
		}
		
		if(count>2)
			return false;
		else
			return true;
		
		
		
	}
	
	

}

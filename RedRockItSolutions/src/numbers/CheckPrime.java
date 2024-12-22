package numbers;

import java.util.Scanner;

public class CheckPrime {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		
		for(int i=0;i<=n;i++) {
			if(isPrime(i))
				System.out.println(i+" ");
		}
		
		
		
	}
	
	private static boolean isPrime(int n) {
		if(n==0 || n==1) 
			return false;
		
		for(int i=2;i<n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	

}

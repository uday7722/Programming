package numbers;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scanner.nextInt();

		boolean rs=checkPerfect(num);
		if(rs)
			System.out.println("Is perfect number");
		else
			System.out.println("Is not a perfect number");
	}

	private static boolean checkPerfect(int num) {

		int sum=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0)
				sum+=i;

		}
		if(sum==num)
			return true;
		else
			return false;

	}

}

package numbers;

import java.util.Scanner;

public class Strongnumber {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scanner.nextInt();
		boolean rs=checkStrong(num);
		if(rs)
			System.out.println("Strong number");
		else
			System.out.println("Not Strong number");		
	}

	private static boolean checkStrong(int num) {
		
		int temp=num;
		int sum=0;
		while(num!=0) {
			int a=num%10;
			 sum+=factorail(a);
			num=num/10;
				
		}	
		
		return sum==temp;
		
	}

	private static int factorail(int a) {
		
		int fact=1;
		
		for(int i=1;i<=a;i++) {
			fact*=+i;
		}
		return fact;
		
	}

}

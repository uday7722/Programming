package numbers;

import java.util.Scanner;

public class FibancciSeries {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the any num");
		int num=scanner.nextInt();
		fibonacci(num);
	}

	private static void fibonacci(int num) {
		
		int a=0,b=1,c=0;
		System.out.print(a+","+b);
		
		if(num==0)
			System.out.println(a);
		else
			for(int i=2;i<=num;i++) {
				c=a+b;
				System.out.print(","+c);
				a=b;
				b=c;
				
			}
		
		
	}

}

package numbers;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);

		int a=scanner.nextInt();
		int b=scanner.nextInt();

		System.out.println("Before swapping" + " a: "+a+ " b: "+b);
		
		

		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println("After swapping" + " a: "+a+ " b: "+b);
	}
}

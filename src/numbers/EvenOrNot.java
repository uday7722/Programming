package numbers;

import java.util.Scanner;

public class EvenOrNot {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the num ");
		int num=scanner.nextInt();
		boolean rs=checkEven(num);
		if(rs)
			System.out.println("The given num is Even");
		else
			System.out.println("The given num is not Even");
	}
	
	public static boolean checkEven(int num) {
		
		if(num%2==0)
			return true;
		else
			return false;
		
	}

}

package numbers;

import java.util.Scanner;

public class NaturalNumbers {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=scanner.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.print(i+" ");
		}
		
	}

}

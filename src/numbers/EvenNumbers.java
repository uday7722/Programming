package numbers;

import java.util.Scanner;

public class EvenNumbers {
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=scanner.nextInt();

		for(int i=1;i<=n;i++) {
			if(i%2==0)
			System.out.print(i+" ");
		}

	}
}

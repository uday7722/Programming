package numbers;

import java.util.Scanner;

public class DivisorsOfN {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scanner.nextInt();
		
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				System.out.print(i+" ");
		}
		
		
	}

}

package numbers;

import java.util.Scanner;

public class FindSmallest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scanner.nextInt();

		int small=9;

		while(num!=0) {
			int a=num%10;
			if(a<small) {
				
				small=a;
				
			}
			num=num/10;
		}
		System.out.println(small);
	}
}

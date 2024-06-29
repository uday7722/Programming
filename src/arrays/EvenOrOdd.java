package arrays;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=scanner.nextInt();

		int[] oddEven=oddEven(size,scanner);

		System.out.println("The count of Odd numbers is: "+oddEven[1]);
		System.out.println("The count of Even numbers is: "+oddEven[0]);
	}

	private static int[] oddEven(int size, Scanner scanner) {

		int[] arr=new int[size];
		System.out.println("Enter the "+size+" values");

		for(int i=0;i<size;i++) {
			arr[i]=scanner.nextInt();
		}

		int countOdd=0;
		int countEven=0;

		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
				countEven++;
			else
				countOdd++;

		}

		return new int[]{countEven,countOdd};



	}

}

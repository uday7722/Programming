package arrays;

import java.util.Scanner;

public class BiggestFromAnArray {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=scanner.nextInt();

		int big=biggestNumber(size,scanner);
		System.out.println("The biggest number in array is: "+big);

	}

	private static int biggestNumber(int size, Scanner scanner) {

		int[] arr=new int[size];
		System.out.println("Enter the "+size+" values");

		for(int i=0;i<size;i++) {
			arr[i]=scanner.nextInt();
		}

		int big=arr[0];
		for(int i=1;i<arr.length;i++) {

			if(big<arr[i])
				big=arr[i];

		}
		return big;
	}

}

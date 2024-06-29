package arrays;

import java.util.Scanner;

public class SumofAnArray {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=scanner.nextInt();
		
		int sum=sumOfAnArray(size,scanner);
		System.out.println("The sum of an array is "+sum);
		
		
	}

	private static int sumOfAnArray(int size,Scanner scanner) {
		
		int[] arr=new int[size];
		System.out.println("Enter the "+size+" values");
		for(int i=0;i<size;i++) {
			arr[i]=scanner.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		
		return sum;
		
	}

}

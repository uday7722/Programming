package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CheckTwoArraysAreEqual {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		int size=scanner.nextInt();

		int[] arr1=new int[size];
		int[] arr2=new int[size];

		for(int i=0;i<arr1.length;i++) {
			arr1[i]=scanner.nextInt();
		}

		for(int i=0;i<arr2.length;i++) {
			arr2[i]=scanner.nextInt();
		}

		boolean rs=checkEqualOrNot(arr1,arr2);

		if(rs)
			System.out.println("Equal");
		else
			System.out.println("Not equal");

	}

	private static boolean checkEqualOrNot(int[] arr1, int[] arr2) {
		
		return Arrays.equals(arr1, arr2);		
	}

}

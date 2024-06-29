package dsa;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[]= {3,5,6,7,8,9};
		int num=new Scanner(System.in).nextInt();

		int k=linearSearch(num,arr);
		if(k==-1)
			System.out.println(num +" is not present");
		else
			System.out.println(k);

	}

	private static int linearSearch(int num,int[] arr) {

		for(int digit:arr) {
			if(digit==num)
				return digit;

		}	
		return -1;
	}

}

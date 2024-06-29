package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=scanner.nextInt();

		
		int arr[]=new int[size];

		int[] reverseArray=reverseArr(size,arr,scanner);

		for (int i : reverseArray) {
			System.out.print(i + " ");
		}

	}

	public static int[] reverseArr(int size,int[] arr,Scanner scanner) {

		System.out.println("Enter the "+size+" values");
		for(int i=0;i<size;i++) {
			arr[i]=scanner.nextInt();
		}


		int[] reversedArr = new int[size];
		for (int i = 0; i < size; i++) {
			reversedArr[i] = arr[size - 1 - i];
		}

		return reversedArr;
	}

}


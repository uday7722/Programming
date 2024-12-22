package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();

		int[] arr1=new int[size];
		int[] arr2=new int[size];

		int[] sortedArr3=new int[arr1.length+arr2.length];

		for(int i=0;i<arr1.length;i++) {
			arr1[i]=scanner.nextInt();
		}

		for(int i=0;i<arr2.length;i++) {
			arr2[i]=scanner.nextInt();
		}

		sortedArr(arr1,arr2,sortedArr3);	
		
		for(int n:sortedArr3) {
			System.out.print(n+" ");
		}

	}

	private static void sortedArr(int[] arr1, int[] arr2, int[] sortedArr3) {

		int i=0,j=0,k=0;

		while(i<arr1.length) {

			sortedArr3[k++]=arr1[i++];

		}

		while(j<arr2.length) {
			sortedArr3[k++]=arr2[j++];
		}

		Arrays.sort(sortedArr3);

	}

}

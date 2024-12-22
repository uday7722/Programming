package arrays;

import java.util.Scanner;

public class CheckDuplicate {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();

		int[] arr=new int[n];

		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
		}

		boolean rs=checkDuplicates(arr);
		if(rs)
			System.out.println("Duplicates are there");
		else
			System.out.println("No duplicates are found");

	}

	private static boolean checkDuplicates(int[] arr) {

		for(int i=0;i<arr.length-1;i++) {

			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])
					return true;
			}


		}		
		return false;
	}

}

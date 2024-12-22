package arrays;

import java.util.Scanner;

public class SmallestAndBiggest {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int size=scanner.nextInt();
		
		int[] smallBig=findSmallBig(size,scanner);
		
		System.out.println("Small is:"+smallBig[0]);
		System.out.println("Small is:"+smallBig[1]);
		
		
		
	}

	private static int[] findSmallBig(int size, Scanner scanner) {
		
		int[] arr=new int[size];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
		}
		
		int big=arr[0];
		int small=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<small) {
				small=arr[i];
			}
			else if(arr[i]>big) {
			big=arr[i];
			}
		}
		
		return new int[] {small,big};
	}

}

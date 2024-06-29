package arrays;

import java.util.Scanner;

public class AverageOfAnArray {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=scanner.nextInt();
		
		double average=averageWeightOfPersons(size,scanner);
		System.out.println("The average is "+ average);
	}

	private static double averageWeightOfPersons(int size, Scanner scanner) {
		
		
		int[] arr=new int[size];
		System.out.println("Enter the "+size+" values");
		
		for(int i=0;i<size;i++) {
			arr[i]=scanner.nextInt();
		}
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			
		}
		
		double avg=sum/size;
		
		return  avg;
	}
}

package arrays;

import java.util.Scanner;

public class PrimeCount {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=scanner.nextInt();

		int count=countPrime(size,scanner);
		System.out.println("No of prime numbers in array is: "+count);

	}

	private static int countPrime(int size, Scanner scanner) {

		int[] arr=new int[size];
		System.out.println("Enter the "+size+" values");

		for(int i=0;i<size;i++) {
			arr[i]=scanner.nextInt();
		}
		
		int primeCount = 0;

		for (int i = 0; i < size; i++) {
			if (isPrime(arr[i])) {
				primeCount++;
			}
		}
		return primeCount;
	}

	private static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;


	}

}

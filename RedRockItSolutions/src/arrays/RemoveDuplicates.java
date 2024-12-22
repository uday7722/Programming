package arrays;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();
		
		int[] arr=new int[size];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
		}
		
		Set<Integer> set=new LinkedHashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		
		for(Integer integer:set) {
			System.out.print(integer+" ");
		}
		
	}

}

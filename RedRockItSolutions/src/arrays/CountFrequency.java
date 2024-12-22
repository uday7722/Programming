package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountFrequency {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		
		int[] arr=new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
		}
		
		Map<Integer, Integer> map=new HashMap<>();
		for(Integer number:arr) {
			if(map.get(number)==null) {
				map.put(number, 1);
			}
			else {
				map.put(number, map.get(number)+1);
			}
		}
		
		for(Map.Entry<Integer, Integer> val:map.entrySet()) {
			System.out.println(val.getKey()+" "+val.getValue());
		}
		
	}

}


package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IrrespectiveFrequency {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String str=scanner.next();
		str=str.toLowerCase();
		
		Map<Character, Integer> map=new HashMap<>();
		
		for(char ch:str.toCharArray()) {
			if(Character.isAlphabetic(ch)) {
				map.put(ch, map.getOrDefault(ch,0)+1);
			}
		}
		
		map.forEach((key,value)->{
			System.out.println(key+" occured "+value);
		});			
	}
}

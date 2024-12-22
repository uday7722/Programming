package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OccurencesOfAString {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String");
		String string=scanner.next();

		String str=string.toLowerCase();

		Map<Character, Integer> map=new HashMap<>();

		for(char ch:str.toCharArray()) {
			if(map.get(ch)==null)
				map.put(ch, 1);
			else
				map.put(ch,map.get(ch)+1);
		}
		
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		


	}

}

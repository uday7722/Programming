package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfAString {
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=scanner.next();
		str=str.toLowerCase();


		Map<Character, Integer> map=new HashMap<Character,Integer>();

		for(char ch:str.toCharArray()) {

			if(map.get(ch)==null) {
				map.put(ch, 1);
			}
			else {
				map.put(ch, map.get(ch)+1);
			}
		}
		map.forEach((key,value)->{
			System.out.println(key +" occured "+value);
		});

	}

}

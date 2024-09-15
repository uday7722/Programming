package numbers;

import java.util.Scanner;

public class DigitOrNumber {

	public static void main(String[] args) {

		int sc=new Scanner(System.in).nextInt();

		String msg=digitOrNum(sc);
		System.out.println(msg);

	}

	private static String digitOrNum(int sc) {
		if(sc<10 && sc>-10)
			return "digit";
		
		return "number";
	}

}

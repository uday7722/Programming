package numbers;

import java.util.Arrays;
import java.util.TreeSet;

public class AscendingPhoneNumber {
	
	
	
	public static void main(String[] args) {
		long phno=9876543214l;
		
		ascendingphno(phno);	
	}

	private static void ascendingphno(long phno) {

		String phoneNumber=Long.toString(phno);
		
		char[] nums=phoneNumber.toCharArray();
	     Arrays.sort(nums);
	     
	     System.out.println(nums);	
	}
	
	
	

}

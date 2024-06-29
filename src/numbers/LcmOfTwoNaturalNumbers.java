package numbers;

import java.util.Scanner;

public class LcmOfTwoNaturalNumbers {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		int a=scanner.nextInt();
		int b=scanner.nextInt();

		int i=a>b?a:b;

		while(true) {
			if(i%a==0 && i%b==0 ) {
				System.out.println(i);
				break;
			}
			i++;
		}
	}



}


/*Take n1 and n2 as an input
 * 
 *
 * 
 * 
 */
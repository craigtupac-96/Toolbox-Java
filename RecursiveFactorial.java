/*
 * Author: Craig Lawlor
 * C00184465
 */
package algorithm;
import java.util.Scanner;

public class RecursiveFactorial {

	public static void main(String[] args) {
		int fact;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number to get it's factorial");
		fact = input.nextInt();
		
		System.out.println(factorial(fact));
		input.close();
	}
	
	public static int factorial(int num){
		if(num <= 1){      // base case
			return 1;
		}
		return num * factorial(num - 1);
	}
}

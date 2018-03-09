/*
 * Author: Craig Lawlor 
 * C00184465
*/
package algorithm;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int userInput;
		int factorial = 1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number to see its factorial");
		userInput = input.nextInt();
		
		for(int index = 1; index <= userInput; index++){
			factorial *= index;
		}
		System.out.println("The factorial of " + userInput + " = " + factorial);
		input.close();
	}
}

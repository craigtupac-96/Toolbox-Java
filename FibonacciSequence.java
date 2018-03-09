/*
 * Author: Craig Lawlor
 * C00184465
 */
package algorithm;
import java.util.Scanner;

public class FibonacciSequence {

	public static void main(String[] args) {
		int limit;
		int num1 = 0;
		int num2 = 1;
		int num3;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the limit");
		limit = input.nextInt();
		
		for(int index = 0; index < limit; index++){
			num3 = num1 + num2;
			System.out.print(num3 + ", ");
			num1 = num2;
			num2 = num3;
		}
		input.close();
	}
}

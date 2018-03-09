/*
 * Author: Craig Lawlor
 * C00184465
 */
package algorithm;
import java.util.Scanner;

public class RecursiveFibonacci {

	public static void main(String[] args) {
		int fib;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Which Fibonacci number to output?");
		fib = input.nextInt();
		
		System.out.println(fibonacci(fib));
		
		input.close();
	}
	
	public static int fibonacci(int num){
		if(num == 1){
			return 1;    // base case
		}
		else if(num < 1){
			return 0;
		}
		return fibonacci(num -1) + fibonacci(num -2);
	}
}

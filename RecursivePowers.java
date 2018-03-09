/*
 * Author: Craig Lawlor
 * C00184465
 */
package algorithm;
import java.util.Scanner;

public class RecursivePowers {

	public static void main(String[] args) {
		int num;
		int pow;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number");
		num = input.nextInt();
		System.out.println("Enter a power");
		pow = input.nextInt();
		
		System.out.println(power(num, pow));
		
		input.close();
	}
	
	public static int power(int n, int p){
		if(p == 1){    // base case
			return n;
		}
		else{
			return n * power(n, p-1);
		}
		
	}
}

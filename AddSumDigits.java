package algorithm;
/*
 * Author: Craig Lawlor
 * C00184465
 */
import java.util.Scanner;

public class AddSumDigits {
	
	public static void main(String[] args) {
		int number;
		int sum = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		number = input.nextInt();
		
		while(number != 0){
			sum += number % 10;
			number = number / 10;
			System.out.println(number + " " + sum);  // Just to see whats going on at each loop
		}
		System.out.println("The Sum of the digits: " + sum);
		input.close();
	}
}

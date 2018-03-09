package algorithm;
/*
 * Author: Craig Lawlor
 * C00184465
 * Description: A program to output asterix in increasing order then decreasing using only 2 loops
 * 			*
 * 			**
 * 			***
 * 			****
 * 			***
 * 			**
 * 			*
 */

public class Asterix {

	public static void main(String[] args) {
		int num = 8;
		
		for (int i = 1; i < num; i++) {
			int m = num / 2 - Math.abs(num / 2 - i);   // Math.abs converts to absolute value, negative will be positive
			for (int j = 0; j < m; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

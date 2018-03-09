/*
 * Author: Craig Lawlor
 * C00184465
 */
package algorithm;
import java.util.Scanner;

public class PrintAsterisk {

	public static void main(String[] args) {
		int num;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of asterisks you want");
		num = input.nextInt();
		
		for(int x = num; x >= 0; x--){
			for(int y = 0; y < x; y++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int x = 1; x <= num; x++){
			for(int y = 0; y < x; y++){
				System.out.print("*");
			}
			System.out.println();
		}
		input.close();
	}

}



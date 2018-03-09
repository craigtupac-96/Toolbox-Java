/*
 * Author: Craig Lawlor
 * C00184465
 */
package algorithm;
import java.util.Scanner;

public class WrapAroundArray {

	public static void main(String[] args) {
		int[] myArr;
		int size;
		int element = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the array size");
		size = input.nextInt();
		myArr = new int[size];
		
		// Loop to set the array elements
		for(int index = 0; index < myArr.length; index++){
			System.out.println("Enter an element");
			myArr[index] = input.nextInt();
		}
		
		// Nested for loop to wrap around the elements
		for(int index = 0; index < myArr.length; index++){
			element = myArr[0];
			for(int i = 0; i < myArr.length-1; i++){
				myArr[i] = myArr[i + 1];
			}
			myArr[myArr.length-1] = element;
			for(int j = 0; j < myArr.length; j++){
				System.out.print(myArr[j] + ", ");
			}
			System.out.println();
		}
		input.close();
	}
}

/*
 * Author: Craig Lawlor
 * C00184465
 */
package algorithm;
import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int[][] myArr;
		
		Scanner input = new Scanner(System.in);
		
		// input the number of rows and columns
		System.out.println("How many rows?");
		int rows = input.nextInt();
		System.out.println("How many cols?");
		int cols = input.nextInt();
		
		myArr = new int[rows][cols];
		
		// setup
		for(int index = 0; index < rows; index++){
			for(int inner = 0; inner < cols; inner++){
				System.out.println("Enter element");
				myArr[index][inner] = input.nextInt();
			}
		}
		
		System.out.println("Enter an element to search for");
		int element = input.nextInt();
		
		// print
		for(int index = 0; index < rows; index++){
			for(int inner = 0; inner < cols; inner++){
				System.out.print(myArr[index][inner] + " ");	
			}
			System.out.println("");
		}
		
		// search for an element
		boolean found = false;           // using a boolean to output a message if not found
		for(int index = 0; index < rows; index++){
			for(int inner = 0; inner < cols; inner++){
				if(myArr[index][inner] == element){
					int row = index + 1;
					int col = inner + 1;
					System.out.println("The element is at row: " + row + " Column: " + col);
					found = true;
				}	
			}
		}
		if(!found){
			System.out.println("The element was not found in the array");
		}
		input.close();
	}
}

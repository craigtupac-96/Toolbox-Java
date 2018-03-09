/*
	Author: Craig Lawlor
	C00184465
	Description: A program to sort an array using bubble sort
*/
package algorithm;
import java.util.Random;

public class InsertionSort {

	public static void main(String[] args) {
		int[] numArray = new int[30];
		Random randomNum = new Random();
		int count = 0;
		int position = 0;
		int newElement;
		
		for (int i = 0; i < numArray.length; i++) {
			newElement = randomNum.nextInt(99) + 1;
			count++;
			
			for (int j = 0; j < count; j++) {
				if (newElement > numArray[j]) {
					position = j + 1;
				}
			}
			
			for (int k = count-1; k > position; k--) {
				numArray[k] = numArray[k+1];
			}
			numArray[position] = newElement;
		}
		
		for (int i = 0; i < numArray.length; i++) {
			System.out.println(numArray[i]);
		}
	}

}

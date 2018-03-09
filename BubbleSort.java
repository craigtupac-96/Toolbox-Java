/*
	Author: Craig Lawlor
	C00184465
	Description: A program to sort an array using bubble sort
*/
package algorithm;
import java.util.Random;

public class BubbleSort {
	public static void main(String[] args) {
		int[] numArray = new int[30];
		Random randomNum = new Random();
		boolean finish = false;
		boolean swap;
		int temp;
		
		System.out.println("Unsorted");
		for (int i = 0; i < numArray.length; i++) {
			numArray[i] = randomNum.nextInt(99) + 1;
			System.out.println(numArray[i]);
		}
		
		while (!finish) {
			swap = false;
			for(int i = 0; i < numArray.length; i++) {
				if(i < numArray.length -1 ){
					if (numArray[i] > numArray[i+1]) {
						temp = numArray[i+1];
						numArray[i+1] = numArray[i];
						numArray[i] = temp;
						swap = true;
					}
				}
			}
			if (!swap) {
				finish = true;
			}
		}
		
		System.out.println("\nSorted");
		for (int i = 0; i < numArray.length; i++) {
			System.out.println(numArray[i]);
		}
	}

}

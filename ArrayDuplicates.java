/*
 * Author: Craig Lawlor
 * C00184465
 */
package algorithm;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayDuplicates {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of names in the array");
		int size = input.nextInt();
		
		String[] nameArray = new String[size];       // new array
		// set array elements
		for(int index = 0; index < nameArray.length; index++){
			System.out.println("Enter a name");
			nameArray[index] = input.next();
		}
		Arrays.sort(nameArray);   // to sort the array
		
		// Count duplicates
		int count;
		for(int index = 0; index < nameArray.length; index++){
			count = 0;
			for(int i = 0; i < nameArray.length; i++){
				if(nameArray[index].equals(nameArray[i])){
					count++;
					index = i;
				}
			}
			System.out.println("Element: " + nameArray[index] + ", Copies: " + count);
		}
		input.close();
	}
}

/*
 * Author: Craig Lawlor 
 * C00184465
*/
package algorithm;
import java.util.Scanner;

public class BinarySearch {
	static int numArray[] = {2, 5, 8, 10, 12, 15, 19, 23, 27, 31, 35, 37, 40, 43, 46, 48, 51, 57, 63, 68, 71, 79, 83, 88, 91, 97};
	
	public static int binarySearch(int numArg){
		int position = - 1;
		int min = 0;
		int max = numArray.length -1;
		int mid;
		
		while(min <= max) {
			mid = min + ((max - min) / 2);
			if (numArray[mid] == numArg) {
				position = mid;
				min = max + 1;
			}
			else if(numArray[mid] < numArg) {
				min = mid + 1;
			}
			else {
				max = mid - 1;
			}
		}
		return position;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number to find it's index");
		int num = input.nextInt();		
		
		if(binarySearch(num) == -1) {
			System.out.println("The number " + num + " was not found");
		}
		else{
			System.out.println("The number " + num + " was found at position " + binarySearch(num));
		}
		input.close();
	}
}

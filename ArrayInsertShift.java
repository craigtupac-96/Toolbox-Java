/*
	Author: Craig Lawlor
	C00184465
	Description: A program to insert an element at a specified index and right shift the elements
*/
package algorithm;
import java.util.Scanner;

public class ArrayInsertShift {

	public static void main(String[] args) {
		int element;
		int index;
		int myArr[] = new int[20];
		int count;
		boolean stay = true;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number (-1 to exit)");
		element = input.nextInt();
		
		System.out.println("Enter the index to insert the element");
		index = input.nextInt();
		
		myArr[index] = element;
		count = index;
		
		while(stay){
			System.out.println("Enter a number (-1 to exit)");
			element = input.nextInt();
			
			if(element == -1){
				stay = false;
			}
			else{
				System.out.println("Enter the index to insert the element");
				index = input.nextInt();
				
				for(int i = count; i >= index; i--){
					myArr[i+1] = myArr[i];
				}
				myArr[index] = element;
			}
			for(int i = 0; i < myArr.length; i ++){
				System.out.println(myArr[i]);
				if(myArr[i] != 0 && myArr[i] > count){
					count = myArr[i];
				}
			}
		}
		input.close();
	}

}

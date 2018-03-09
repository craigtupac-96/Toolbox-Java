/*
 * Author: Craig Lawlor
 * C00184465
 */
package algorithm;

public class ReverseArray {

	public static void main(String[] args) {
		String[] myArr = {"a", "b", "c", "d", "e"};
		int count = myArr.length;
		String[] revArr = new String[count+1];
		
		for(int index = 0; index < myArr.length; index++){
			revArr[count] = myArr[index];
			count--;
			System.out.print(myArr[index]);
		}
		// Output array
		for(int index = 0; index < revArr.length; index++){
			System.out.println(revArr[index]);
		}
	}
}
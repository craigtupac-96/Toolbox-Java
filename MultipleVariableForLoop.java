/*
 * Author: Craig Lawlor 
 * C00184465
*/
package algorithm;

public class MultipleVariableForLoop {

	public static void main(String[] args) {
		int index1, index2;
		
		System.out.println("Index1\tIndex2");
		for(index1 = 0, index2 = 0; index1 < 14; index1++, index2+=2){
			System.out.println(index1 + "\t" + index2);
		}
	}
}

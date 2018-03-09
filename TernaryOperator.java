/*
 * Author: Craig Lawlor 
 * C00184465
*/
package algorithm;
import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		int age;
		boolean vote;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your age");
		age = input.nextInt();
		
		// the boolean vote will be true if the age is over 18, else false
		vote = age >= 18 ? true : false;
		if(vote){
			System.out.println("You are old enough to vote");
		}
		else{
			System.out.println("You are NOT old enough to vote");
		}
		input.close();
	}

}

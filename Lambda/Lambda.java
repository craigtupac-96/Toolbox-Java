/*
Author: Craig Lawlor
C00184465
Description: A program to explore Lambda. Anonymous methods without public static etc.. 
			 Doesn't have to belong to a class. Can be passed around like an object
			 * Lambdas are usually single purpose and do not affect other objects
*/

public class Lambda {

	public static void main(String[] args) {
		
		// phone is equal to the lambda function
		Answerable phone = () -> {return "Hello";};   // can remove return, the semi-colon after hello and the curly brackets
		System.out.println(phone.answer());
		
		Predicate isOdd =  n -> n % 2 != 0;
		System.out.println(isOdd.test(2));
		
		Predicate isEven = n -> n % 2 == 0;
		System.out.println(isEven.test(2));
	}

}

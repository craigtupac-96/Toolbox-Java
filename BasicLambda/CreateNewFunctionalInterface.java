/*
Author: Craig Lawlor
C00184465
Description: A program to create a functional interface, using lambda functions on it
*/
public class CreateNewFunctionalInterface {

	public static void main(String[] args) {
		Calculate add = (a, b) -> a + b;
		Calculate difference = (a, b) -> Math.abs(a - b);
		Calculate divide = (a, b) -> (b != 0 ? a/b : 0);
		Calculate multiply = (c, d) -> c * d;
		
		System.out.println(add.calc(3, 2));
		System.out.println(difference.calc(5, 10));
		System.out.println(divide.calc(12, 0));
		System.out.println(multiply.calc(3, 5));
		
		// my own interface implementation
		SimpleInterface simpObj = () -> System.out.println("Say something");
		simpObj.doSomething();
	}

}

// Including the interface in this file for ease of reading
@FunctionalInterface
interface Calculate{
	int calc(int x, int y);
}

// My own simple functional interface
@FunctionalInterface
interface SimpleInterface{
	public void doSomething();
}
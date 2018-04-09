/*
Author: Craig Lawlor
C00184465
Description: A program to use functional interfaces with Lambda 
*/
import java.util.function.*;

public class FunctionalInterfaces {

	public static void main(String[] args) {
		// Consumer takes 1 arg, no return // uses accept method
		Consumer<String> consumerStr = (s) -> System.out.println(s.toLowerCase());
		consumerStr.accept("ABCDefghijklmnopQRSTuvWxyz");
		
		// Function takes 1 arg, produces result // 
		Function<Integer, String> converter = (num)-> Integer.toString(num);
		System.out.println("length of 26: " + converter.apply(26).length());
		
		// Supplier represents supplier of results // uses get method
		Supplier<String> s = () -> "Java is fun";
		System.out.println(s.get());
		
		// BinaryOperator takes 2 args, returns 1 // uses apply method
		BinaryOperator<Integer> add = (a, b) -> a + b;
		System.out.println("add 10 + 25: " + add.apply(10, 25));
		
		// UnaryOperator takes 1 arg, returns value // uses apply method
		UnaryOperator<String> str = (msg) -> msg.toUpperCase();
		System.out.println(str.apply("This is my message in upper case"));
		
		// Predicate takes one arg, returns bool
	}

}

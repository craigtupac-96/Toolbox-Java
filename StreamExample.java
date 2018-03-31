/*
Author: Craig Lawlor
C00184465
Description: A program to see how stream works. It goes through a list 
*/
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		Arrays.asList("red", "green", "blue").stream().sorted().findFirst().ifPresent(System.out::println);
		
		// example of Stream.of with a filter // prints all fruit starting with a
		Stream.of("apple", "pear", "banana", "cherry", "apricot").filter(fruit -> {
			return fruit.startsWith("a");
		})
		// without forEach nothing will print
		// forEach makes it a terminal operation
		.forEach(fruit -> System.out.println("Starts with A: " + fruit));   
		
		// using a stream and a map operation to create a list of words in caps
		List<String> collected = Stream.of("Java", " Rocks")
				.map(String -> String.toUpperCase()).collect(Collectors.toList());
		System.out.println(collected.toString());
		
	}

}

/*
Author: Craig Lawlor
C00184465
Description: A program to take the people objects from the array and wrap them in a stream
*/
//import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStream {

	public static void main(String[] args) {
		
		Person[] people = {
				new Person("Joe", 48),
				new Person("Mary", 30),
				new Person("Mike", 73)};
		
		// take the array and wrap it in a stream   
		Stream<Person> stream = Stream.of(people);
		// can use the following either
		//Stream<Person> stream = Arrays.stream(people);
				
		stream.forEach(p -> System.out.println(p.getPersonInfo()));
	}

}

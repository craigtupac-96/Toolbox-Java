/*
Author: Craig Lawlor
C00184465
Description: A program to get the sum and average of peoples ages using streams
*/
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class SumAndAverage {

	public static void main(String[] args) {
List<Person> people = new ArrayList<>();
		
		people.add(new Person("Joe", 48));
		people.add(new Person("Mary", 30));
		people.add(new Person("Mike", 73));
		
		// sum
		int sum = people.stream()
				.mapToInt(p -> p.getAge())
				.sum();
		
		System.out.println("Total of Ages: " + sum);
		
		// average
		OptionalDouble avg = people.stream()      
				.mapToInt(p -> p.getAge())
				.average();
		
		if (avg.isPresent()) {
			System.out.println("Average: " + avg.getAsDouble());
		} else {
			System.out.println("Average not calculated");
		}
	}
	
}

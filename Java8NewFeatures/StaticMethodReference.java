/*
Author: Craig Lawlor
C00184465
Description: A program to sort people by their age using static method reference
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StaticMethodReference {

	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<>();
		
		people.add(new Person("Joe", 48));
		people.add(new Person("Mary", 30));
		people.add(new Person("Mike", 73));
		
		Collections.sort(people, Person :: compareAges); // :: separate type or object from name of method
		people.forEach(p -> System.out.println(p));
	}

}

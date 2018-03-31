/*
Author: Craig Lawlor
C00184465
Description: A program to use collections with and without lambdas
*/
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsWithLambda {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("John", "Paul", "George", "Ringo");
		
		// Sorting before Lambdas
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				return a.compareTo(b);
			}
		});
		
		// with lambda
		Collections.sort(names, (a, b) -> a.compareTo(b));
		
		// This is how to print list items
		for(int i = 0; i < names.size(); i ++) {
			System.out.println(names.get(i));
		}
		
		// Or print like this
		System.out.println(names);
	}

}
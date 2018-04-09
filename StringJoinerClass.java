import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeSet;

public class StringJoinerClass {

	public static void main(String[] args) {
		
		// one way
		String stooges = String.join(" and ", "Larry", "Curly", "Moe");
		System.out.println(stooges);
		
		String[] states = {"California", "Oregon", "Washington"};
		String statesList = String.join(", ", states);
		System.out.println(statesList);
		
		System.out.println();
		// another way using StringJoiner class
		StringJoiner sj = new StringJoiner(", ", "{", "}");
		sj.setEmptyValue("No stooges yet");
		System.out.println(sj);
		
		sj.add("moe")
			.add("Larry")
			.add("Curly");
		System.out.println(sj);
		
		// merging StringJoiner instances
		StringJoiner sj2 = new StringJoiner(",");
		sj2.add("Shemp");
		
		sj.merge(sj2);
		System.out.println(sj);
		
		// working with collections
		Set<String> set = new TreeSet<>();
		set.add("California");
		set.add("Oregon");
		set.add("Washington");
		StringJoiner sj3 = new StringJoiner(" and ");
		set.forEach(s -> sj3.add(s));
		
		System.out.println(sj3);
	}

}

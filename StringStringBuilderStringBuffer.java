/*
Author: Craig Lawlor
C00184465
Description: A program to explore synchronised blocks with a count-down
*/
public class StringStringBuilderStringBuffer {

	public static void main(String[] args) {
		String s1 = "Craig's";
		concat1(s1); // s1 is not changed
		System.out.println("String: " + s1);
		
		StringBuilder s2 = new StringBuilder("Craig's");
		concat2(s2); // s2 is changed
		System.out.println("StringBuilder: " + s2);
		
		StringBuffer s3 = new StringBuffer("Craig's");
		concat3(s3); // s3 is changed
		System.out.println("StringBuffer: " + s3);
	}
	
	public static void concat1(String s1) {
		s1 += " Strings";
	}
	
	public static void concat2(StringBuilder s2) {
		s2.append(" Strings");
	}
	
	public static void concat3(StringBuffer s3) {
		s3.append(" Strings");
	}

}

/*
 * Author: Craig Lawlor 
 * C00184465
*/
package algorithm;

public class ZipMergeStrings {

	public static void main(String[] args) {
		String a = "1234";
		String b = "56789";
		
		System.out.println(merge(a, b));
	}
	
	public static String merge(String a, String b) {
	    int lenA = a.length();
	    int lenB = b.length();
	    String merged = "";
	    int max = lenA > lenB ? lenA : lenB;            // ternary operator
	    
	    for (int index = 0; index < max; index++) {
	        if (index < lenA) {
	            merged += a.charAt(index);
	        }
	        if (index < lenB) {
	            merged += b.charAt(index);
	        }
	    }
	    return merged;
	}

}

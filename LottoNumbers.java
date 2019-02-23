/*
	Author: Craig Lawlor
	Date: 23/02/2019
	Description: A simple lotto number generator to shake off the cobwebs
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LottoNumbers {
	
	public static void generateIrish(int loop) {
		Random rnd = new Random();
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < loop; i++) {
			for(int k = 0; k < 6; k++) {
				int num = rnd.nextInt(47) + 1;
				boolean exists = list.contains(num);
				
				while(exists) {
					num = rnd.nextInt(46) + 1;
					exists = list.contains(num);
				}
				list.add(num);
			}
			printList(list);
			list.clear();
		}
	}
	
	public static void printList(List<Integer> lottoLine) {
		Collections.sort(lottoLine);
		for(Integer number : lottoLine) {
			System.out.print(number.intValue() + ", ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many lines?");
		int lines = input.nextInt();
		
		generateIrish(lines);
		input.close();
	}
}

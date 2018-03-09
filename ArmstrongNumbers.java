
/*
 * Author: Craig Lawlor
 * C00184465
 */
package algorithm;

public class ArmstrongNumbers {

	public static void main(String[] args) {
		int power = 3;
		int sum;
		int num;
		
		for(int i = 100; i < 1000; i++) {
			sum = 0;
			num = i;
			while(num != 0) {
				sum += Math.pow(num % 10, power);
				num /= 10;
			}
			if(sum == i) {
				System.out.println(i);
			}
		}
	}
}

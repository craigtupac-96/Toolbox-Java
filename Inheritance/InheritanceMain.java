/*
Author: Craig Lawlor
C00184465
Description: An inheritance program. The Cat and Dog classes must use the play method from the Pet interface  
*/
import java.util.Random;

public class InheritanceMain {

	public static void main(String[] args) {
		Dog d = new Dog();
		Cat c = new Cat();
		
		if(c instanceof Pet) {
			c.play();
		}
		if(d instanceof Pet) {
			d.play();
		}
		Pet p;
		Random rand = new Random();
		int n = rand.nextInt(2);
		
		if(n == 0) {
			p = new Dog();
		}
		else {
			p = new Cat();
		}
		
		p.play();
	}

}

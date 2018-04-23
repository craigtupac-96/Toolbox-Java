/**
 * A program to explore dynamic polymorphism, also known as runtime polymorphism
 * This example has multilevel inheritance
 * @author Craig Lawlor
 * C00184465
 */
public class PolymorphismDynamic {

	public static void main(String[] args) {
		
		Animal animal1, animal2, animal3;
		
		animal1 = new Animal();
		animal2 = new Lion();
		animal3 = new Cub();
		
		// eat method of Animal class is overridden by Lion class and cub class
		animal1.eat();
		animal2.eat();
		animal3.eat();
	}

}

class Cub extends Lion {
		
	public void eat() {
			
		System.out.println("drinking milk");
	}
}
	
class Lion extends Animal {
		
	public void eat() {
		
		System.out.println("eating meat");
	}
}
	
class Animal {
		
	public void eat() {
		
		System.out.println("eating");
	}
}

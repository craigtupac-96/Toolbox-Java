/**
 * A program to explore static polymorphism, also known as compile time polymorphism
 * @author Craig Lawlor
 * C00184465
 */
public class PolymorphismStatic {

	public static void main(String[] args) {
		
		AddNumbers obj = new AddNumbers();
		
		System.out.println(obj.add(5, 15));
		System.out.println(obj.add(7, 20, 15));
	}

}

// uses method overloading
class AddNumbers{
	
	public int add(int num1, int num2) {
		
		return num1 + num2;
	}
	
	public int add(int num1, int num2, int num3) {
		
		return num1 + num2 + num3;
	}
	
}

/**
 * An example of inheritance from abstract classes and implementing an interface 
 * (All classes in one file for ease of reading)
 * @author Craig Lawlor
 * C00184465
 */
public class AbstractAndInterface {

	public static void main(String[] args) {
		
		Son theSon = new Son();
		
		// implemented in Son class
		System.out.println(theSon.grandfatherAbstractMethod());
		System.out.println(theSon.fatherAbstractMethod());
		System.out.println(theSon.motherInterfaceMethod());
		System.out.println(theSon.sonMethod());
		
		// not implemented in Son class
		theSon.nonAbstractMethodFather();
		theSon.nonAbstractMethodGrandfather();
		
		System.out.println("\nCombined family number: " + theSon.calculateFamilyNumber());
		
		// Abstract classes cannot be instantiated, but they can be subclassed
		// Father f = new Father();   <-can't do this		
	}

}


class Son extends Father implements IMother {
	int sonNumber = 2;
	
	// must use ALL abstract methods from Father
	@Override
	String fatherAbstractMethod() {
		
		return "Abstract Father stuff";
	}

	// must also use abstract methods from Grandfather class 
	@Override
	String grandfatherAbstractMethod() {
		
		return "Abstract Grandfather stuff";
		
	}
	
	// must provide concrete implementation of all methods from interface
	@Override
	public String motherInterfaceMethod() {
		
		return "Abstract Mother stuff";
		
	}
	
	public String sonMethod() {
		
		return "Son stuff\n";
	}
	
	public int calculateFamilyNumber() {
		
		// remember static belongs to the class not the instance of class
		return sonNumber + Father.fatherNumber + Grandfather.grandfatherNumber
				+ IMother.MOTHERNUMBER;
	}

}


abstract class Father extends Grandfather {
	static int fatherNumber = 7;
	
	abstract String fatherAbstractMethod();
	
	void nonAbstractMethodFather() {System.out.println("Non abstract father");}
}


abstract class Grandfather {
	static int grandfatherNumber = 12;
	
	abstract String grandfatherAbstractMethod();
	
	void nonAbstractMethodGrandfather() {System.out.println("Non abstract grandfather");}
}


// interface variables must be static and final
interface IMother {
	static final int MOTHERNUMBER = 5;
	
	public String motherInterfaceMethod();
}


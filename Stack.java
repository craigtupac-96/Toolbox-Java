/*
 * Author: Craig Lawlor
 * C00184465
 */
package algorithm;

public class Stack{
	public int top = -1;          // The last element in the stack
	public int[] myStack = new int[100];
	
	// Default constructor
	public Stack(){    
	}

	// Constructor
	public Stack(int element){
		push(element);
	}
	
	public void push(int var){
		top++;
		myStack[top] = var;
	}
	
	public int[] getStack(){
		return myStack;
	}
	
	//A method to print the stack
	public void printStack(){
		System.out.print("Stack: ");
		for(int index = 0; index <= top; index++){
			System.out.print(myStack[index] + ", ");
		}
		System.out.println(); // blank line
	}
	
	public int peek(){
		return myStack[top];
	}
	
	public int pop(){
		int	num = myStack[top];
		top--;
		return num;
	}
	
	// method to check if the stack is empty
	public boolean isEmpty(){
		boolean bool = true;
		if(top > -1){
			bool = false;
		}
		return bool;
	}
}

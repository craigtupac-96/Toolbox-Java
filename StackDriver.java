/*
 * Author: Craig Lawlor
 * C00184465
 */
package algorithm;
import java.util.Scanner;

public class StackDriver {
	
	public static void main(String[] args){
		int num;
		int option = 0;
		
		Scanner input = new Scanner(System.in);
		Stack stack1 = new Stack();
		
		System.out.println("What would you like to do?\n1: Push\n2: Pop"
				+ "\n3: Check if empty\n4: Peek\n5: View Stack\nType -1 to exit\n");
		//while loop to enter stack elements
		while(option != -1){
			option = input.nextInt();
			// Using a switch statement to manage the menu
	        switch (option) {
	            case 1:  System.out.println("Enter a number or -1 to return to menu");
	            		 num = input.nextInt();
	            		 if(num == -1){            // if statement to see of the user input is -1
	            			 break;
	            		 }
	            		 else{
	            			 stack1.push(num); 
	            		 }
	                     break;
	            case 2: if(!stack1.isEmpty()){
	            			int popped = stack1.pop();
	            			System.out.println("The element that was popped was " + popped);
		   				}
	            		else{
	            			System.out.println("The stack is empty. You cannot pop");
	            		} 
                		 break;
	            case 3:  if(stack1.isEmpty()){
	            			System.out.println("The stack is empty");
	            		 }
	            		 else{
	            			System.out.println("The stack is not empty");
	            		}
                		 break;
	            case 4:  if(!stack1.isEmpty()){
	            			 System.out.println(stack1.peek());
	            		 }
	            		 else{
	            			 System.out.println("There is no element to peek at");
	            		 }
                		 break;
	            case 5:  stack1.printStack();
                		 break;
	            default: ;
	                     break;
	        }
		}
		input.close();           // closing the Scanner class
	}
}



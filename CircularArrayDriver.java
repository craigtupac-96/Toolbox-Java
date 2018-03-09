/*
 * Author: Craig Lawlor
 * C00184465
 */
package algorithm;
import java.util.Scanner;

public class CircularArrayDriver {

	public static void main(String[] args) {
		int option = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What size is the queue?");
		int size = input.nextInt();
		CircularArray circular = new CircularArray(size);            // new queue object
		
		System.out.println("What would you like to do?\n1: Enqueue\n2: Dequeue\n3: Peek front"
				+ "\n4: Check if empty\n5: Check if full\n6: Array size\n-1 to exit\n");
		while(option != -1){
			option = input.nextInt();
			switch (option) {
	            case 1: if(!circular.isFull()){
	            			System.out.println("Enter a number or -1 to return to menu");
	            			int num = input.nextInt();
	            			if(num == -1){            // if statement to see of the user input is -1
	    			   			break;
	    	            		}
	    	            		else if(circular.isFull()){
	    	            			System.out.println("The array is full");
	    	            			break;
	    	            		}
	    	            		else{
	    			   			circular.enQueue(num); 
	    	            		}
	    			            break;
	            		}
			            else{
			            	System.out.println("The array is full");
			            }
	            		break;
			   case 2:  int removed = circular.deQueue();
			   			if(removed == -1){
			   				break;
			   			}	
			   			else{
			   				System.out.println("The deQueued element is " + removed);
			   			}
			   			break;
			   case 3:  System.out.println("Front location: " + circular.peekFront());
	   					break;
			   case 4:  if(circular.isEmpty()){
				   			System.out.println("The array is empty");
			   			}
			   			else{
			   				System.out.println("The array is not empty");
			   			}
	   					break;
			   case 5:  if(circular.isFull()){
		   			System.out.println("The array is full");
	   			}
	   			else{
	   				System.out.println("The array is not full");
	   			}
					break;
			   case 6:	System.out.println("The number of elements in the array: " + circular.size());
					break;
			   default: ;
			         	break;
			}
		}
		input.close();           // closing the Scanner class
	}
}

/*
 * Author: Craig Lawlor
 * C00184465
 */
package algorithm;
import java.util.Scanner;

public class DoubleEndedQueueDriver {

	public static void main(String[] args) {
		int option = 0;
		int removed;
		
		Scanner input = new Scanner(System.in);
		
		/*System.out.println("What size is the queue?");
		int size = input.nextInt();*/
		DoubleEndedQueue queue = new DoubleEndedQueue(20);            // new queue object
		
		System.out.println("Menu\n1: Enqueue front\n2: Dequeue front"
				+ "\n3: Enqueue rear\n4: Dequeue rear\n5: Front and Rear locations\n6: Queue size\n-1 to exit\n");
		while(option != -1){
			System.out.println("Pick an option(-1 to exit)");
			option = input.nextInt();
			switch (option) {
	            case 1: if(!queue.isFull()){
	            			System.out.println("Enter a number or -1 to return to menu");
		            		int num = input.nextInt();
		            		if(num == -1){            // if statement to see of the user input is -1
				   			break;
		            		}
		            		else{
				   			queue.enQueueF(num); 
		            		}
	            		}
	            		else{
	            			System.out.println("The array is full");
	            		}
			            break;
			   case 2:  removed = queue.deQueueF();
			   			if(removed == -1){
			   				System.out.println("The array is empty, you cannot dequeue");
			   			}
			   			else{
			   				System.out.println("The deQueued element is " + removed);
			   			}
			   			break;
			   case 3:	if(!queue.isFull()){
	            			System.out.println("Enter a number or -1 to return to menu");
		            		int num = input.nextInt();
		            		if(num == -1){            // if statement to see of the user input is -1
				   			break;
		            		}
		            		else{
				   			queue.enQueueR(num); 
		            		}
	            		}
	            		else{
	            			System.out.println("The array is full");
	            		}
			            break;
			   case 4:  removed = queue.deQueueR();
	   					if(removed == -1){
	   						System.out.println("The array is empty, you cannot dequeue");
	   					}
	   					else{
	   						System.out.println("The deQueued element is " + removed);
	   					}
	   					break;
			   case 5:  System.out.println("Front: " + queue.front() + "\nRear: " + queue.rear());
			   			break;
			   case 6:  System.out.println("The queue size: " + queue.size());
	   					break;
			   default: ;
			         	break;
			}
		}
		input.close();           // closing the Scanner class
	}
}

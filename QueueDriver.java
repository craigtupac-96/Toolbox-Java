/*
 * Author: Craig Lawlor
 * C00184465
 */
package algorithm;
import java.util.Scanner;

public class QueueDriver {

	public static void main(String[] args) {
		int option = 0;
		
		Scanner input = new Scanner(System.in);
		Queue queue1 = new Queue();            // new queue object
		
		System.out.println("What would you like to do?\n1: Enqueue\n2: Dequeue"
				+ "\n3: Check if empty\n4: View Queue\n-1 to exit\n");
		while(option != -1){
			option = input.nextInt();
			switch (option) {
	            case 1: System.out.println("Enter a number or -1 to return to menu");
	            		int num = input.nextInt();
	            		if(num == -1){            // if statement to see of the user input is -1
			   			break;
	            		}
	            		else{
			   			queue1.enQueue(num); 
	            		}
			            break;
			   case 2:  int removed = queue1.deQueue();
			   System.out.println("The deQueued element is " + removed);
			   			break;
			   case 3:  if(queue1.isEmpty()){
			   				System.out.println("The queue is empty");
			   			}
			   			else{
			   				System.out.println("The queue is not empty");
			   				// call the length
			   			}
			   			break;
			   case 4:  queue1.printQueue();
			   		 	break;
			   case 5:  System.out.println("The length of the queue is " + queue1.length());
			   		 	break;
			   default: ;
			         	break;
			}
		}
		input.close();           // closing the Scanner class
	}
}

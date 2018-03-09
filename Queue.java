/*
 * Author: Craig Lawlor
 * C00184465
 */
package algorithm;

public class Queue {
	public int count = -1;
	public int[] queue = new int[100];
	public int newEl;
	
	public Queue(){

	}
	
	//Constructor
	public Queue(int element){
		enQueue(element);
	}
	
	public void enQueue(int element){
		count++;		
		queue[count] = element;
	}
	
	public int deQueue(){
		int removed = queue[0];
		for(int index = 0; index <= count; index++){
			queue[index] = queue[index+1];
		}
		count--;
		return removed;
	}
	
	//A method to print the queue
	public void printQueue(){
		System.out.print("Queue: ");
		for(int index = 0; index <= count; index++){
			System.out.print(queue[index] + ", ");
		}
		System.out.println(); // blank line
	}
	
	public int length(){
		int length = 0;
		for(int index = 0; index <= count; index++){
			length++;
		}
		return length;
	}
	
	// method to check if the stack is empty
		public boolean isEmpty(){
			boolean bool = true;
			if(count > -1){
				bool = false;
			}
			return bool;
		}
}

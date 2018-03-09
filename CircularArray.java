/*
 * Author: Craig Lawlor
 * C00184465
 */
package algorithm;

public class CircularArray {
	public int size;
	public int front = 0;
	public int rear = -1;
	public int[] circular;
	public int noOfElements;
	
	// Constructor
	public CircularArray(int elements){
		size = elements;
		circular = new int[size];
		noOfElements = 0;
	}
	
	public void enQueue(int num){
		if(front == 0 && rear == -1){
			rear = 0;
			circular[rear] = num;
			noOfElements++;
			
		}
		else{
			rear = (rear + 1) % size;        // check for %=
			circular[rear] = num;
			noOfElements++;
		}
	}
	
	public int deQueue(){
		int deQueued;
		if(noOfElements == 0){
			System.out.println("The array is empty, you cannot dequeue");
			deQueued = -1;
		}
		else{
			deQueued = circular[front];
			front = front + 1 % size;
			noOfElements--;
		}
		return deQueued;
	}
	
	public boolean isEmpty(){
		boolean value = true;
		if(noOfElements > 0){
			value = false;
		}
		return value;
	}
	
	public boolean isFull(){
		boolean value = false;
		if(noOfElements == size){
			value = true;
		}
		return value;
	}
	
	// Checkers
	public int peekFront(){
		return front;
	}
	
	public int size(){
		return noOfElements;
	}
}

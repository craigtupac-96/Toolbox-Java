/*
 * Author: Craig Lawlor
 * C00184465
 */
package algorithm;

public class DoubleEndedQueue {
	public int size;
	public int front = -1;
	public int rear = -1;
	public int[] myArr;
	public int noOfElements;
	
	public DoubleEndedQueue(){
		
	}
	
	// Constructor
	public DoubleEndedQueue(int num){
		size = num;               
		myArr = new int[size];	    // first element will default at the front
		noOfElements = 0;
	}
	
	// enqueue front
	public void enQueueF(int num){
		if(front == -1 && rear == -1){
			front++;
			rear++;
			myArr[front] = num;
			noOfElements++;
		}
		else{
			rear++;
			for(int index = rear; index >= front; index--){
				myArr[index + 1] = myArr[index];
			}
			myArr[front] = num;
			noOfElements++;
		}
	}
	
	// dequeue front
	public int deQueueF(){
		int element;
		if(noOfElements == 0){
			element = -1;
		}
		else if(front == rear || rear == 0){
			element = myArr[front];
			noOfElements--;
		}
		else{
			element = myArr[front];
			front++;
			noOfElements--;
		}
		return element;
	}
	
	// enqueue rear
	public void enQueueR(int num){
		if(front == -1 && rear == -1){
			front++;
			rear++;
			myArr[rear] = num;
			noOfElements++;
		}
		else{
			rear++;
			myArr[rear] = num;
			noOfElements++;
		}
	}
	
	// dequeue rear
	public int deQueueR(){
		int element;
		if(noOfElements == 0){
			element = -1;
		}
		else if(front == rear || rear == 0){
			element = myArr[rear];
			noOfElements--;
		}
		else{
			element = myArr[rear];
			rear--;
			noOfElements--;
		}
		return element;
	}
	
	public int front(){
		return front;
	}
	
	public int rear(){
		return rear;
	}
	
	public boolean isFull(){
		boolean bool = false;
		if(noOfElements == size){
			bool = true;
		}
		return bool;
	}
	
	public boolean isEmpty(){
		boolean bool = true;
		if(noOfElements > 0){
			bool = false;
		}
		return bool;
	}
	
	public int size(){
		return noOfElements;
	}
}

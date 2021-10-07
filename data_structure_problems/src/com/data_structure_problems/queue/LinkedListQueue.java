package com.data_structure_problems.queue;

public class LinkedListQueue {

	Node front, rear;
	
	
	public void enqueue(int value) {
		Node node = new Node(value);
		if(rear == null && front == null) {
			front = rear = node;
		}else{
			rear.next = node;
			rear = rear.next;
		}
	}
	
	public void dequeue() {
		if(front == null && rear == null) {
			System.out.println("The Queue is empty");
		}else{
			System.out.println(front.data);
			front = front.next;
			
			if(front == null) {
				rear = null;
			}
		}
	}
	
	public static void main(String[] args) {
		LinkedListQueue queue = new LinkedListQueue();
		queue.enqueue(0);
		queue.enqueue(2);
		queue.enqueue(4);
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
	}
	
}
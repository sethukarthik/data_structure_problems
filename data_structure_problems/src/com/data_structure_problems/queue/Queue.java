package com.data_structure_problems.queue;

import java.util.Arrays;

public class Queue {

	static final int SIZE = 5;
	int[] arr = new int[SIZE];
	int front = 0;
	int rear = 0;
	
	public void enqueue(int value) {
		if(rear == SIZE) {
			System.out.println("Queue size is full");
		}else{
			arr[rear] = value;
			rear++;
		}
	}
	
	public void dequeue() {
		if(front == rear) {
			System.out.println("Queue is empty");
		}else{
			System.out.println(arr[front]);
			front++; 
		}
	}
	
	public void print() {
		if(front == rear) {
			System.out.println("Queue is empty");
		}else {
			for (int i : arr) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(5);
		queue.print();
		System.out.println("------------------");
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		System.out.println("------------------");
		queue.print();
	}
	
}
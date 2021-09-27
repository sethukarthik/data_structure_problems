package com.data_structure_problems.circle_linkedlist;

public class LinkedList {

	Node head;
	
	public void addFirst(int val) {
		Node newNode = new Node();
		newNode.data = 10;
		
		if(head == null) {
			newNode.next = null;
			head = newNode;
		}else {
			Node last = head;
			while(last != head) {
				last = last.next;
			}
			last.next = newNode;
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void print() {
		Node temp = head;
		
		if(temp == null) {
			System.out.println("LinkedList is empty");
		}
				
		do {
			System.out.println(temp.data);
			temp = temp.next;
		}while(temp != head);
	}
	
	public static void main(String[] args) {
		LinkedList linkedlist = new LinkedList();
		linkedlist.addFirst(0);
		linkedlist.addFirst(2);
		linkedlist.addFirst(1);
		
		linkedlist.print();
	}
	
	
//	public static void main(String[] args) {
//		Node head, middle, tail;
//		
//		head = new Node();
//		middle = new Node();
//		tail = new Node();
//		
//		head.data = 10;
//		middle.data = 20;
//		tail.data = 30;
//		
//		head.next = middle;
//		middle.next = tail;
//		tail.next = head;
//		
//		Node temp = head;
//		
//		do {
//			System.out.println(temp.data);
//			temp = temp.next;
//		}while(temp != head);
//	}
}
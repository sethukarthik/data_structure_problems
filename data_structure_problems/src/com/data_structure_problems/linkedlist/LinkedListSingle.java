package com.data_structure_problems.linkedlist;
 
public class LinkedListSingle {
	
	public static void main(String[] args) {
		Node head, middle, tail;
		
		head = new Node();
		middle = new Node();
		tail = new Node();
		
		head.data = 10;
		middle.data = 20;
		tail.data = 30;
		
		System.out.println(head.toString());
		
		head.next = middle;
		middle.next = tail;
		tail.next = null;
		
		System.out.println(head.toString());
		
		Node temp = head;
		
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
}

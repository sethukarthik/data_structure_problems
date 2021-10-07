package com.data_structure_problems.linkedlist;

public class LinkedListInsert {
	Node head;
	
	public void addFirst(int val) {
		Node newNode = new Node();
		newNode.data = val;
		newNode.next = head;
		
		head = newNode;
	}
	
	public void addLast(int val) {
		Node newNode = new Node();
		newNode.data = val;
		newNode.next = null;
		
		if(head == null) {
			head = newNode;
		} else {
			Node last = head;
			while(last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
		
	}
	
	public void deleteNode(int val) {
		if(head.data == val) {
			head = head.next;
		} else {
			Node temp = head;
			while(temp.next != null) {
				if(temp.next.data == val) {
					temp.next = temp.next.next;
					break;
				} else {
					temp = temp.next;
				}
			}
		}
	}
	
	public boolean search(int val) {
		Node temp = head;
		while(temp != null) {
			if(temp.data == val) return true;
			temp = temp.next;
		}
		return false;
	}
	
	public void print() {
		Node temp = head;
		while(temp != null){
			System.out.println(temp.data);
			temp = temp.next; 
		}
	}
	
	public static void main(String[] args) {
//		LinkedListInsert llInsert = new LinkedListInsert();
//		llInsert.addFirst(0);
//		llInsert.addFirst(1);
//		llInsert.addFirst(3);
//		llInsert.addFirst(4);
//		llInsert.addLast(50);
//		llInsert.addLast(60);
//		llInsert.addLast(70);
//		llInsert.addLast(80);
//		llInsert.deleteNode(0);
//		llInsert.deleteNode(1);
//		llInsert.deleteNode(3);
//		System.out.println(llInsert.search(0));
//		System.out.println(llInsert.search(50));
//		llInsert.print();
		
		float sum = 2 + 9 + 0;
		System.out.println(sum % 10);
	}
}
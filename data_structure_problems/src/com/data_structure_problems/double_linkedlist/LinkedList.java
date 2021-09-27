package com.data_structure_problems.double_linkedlist;

public class LinkedList {
	
	Node head, prev;
	
	public void addFirst(int val) {
		Node newNode = new Node();
		newNode.data = val;

		if(head == null) {
			newNode.next = null;
			newNode.prev = null;
			head = newNode;
		}else{
			newNode.prev = null;
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}
	
	public void printForward() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public void printReverse() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public void addLast(int val) {
		Node newNode = new Node();
		newNode.data = val;

		if(head == null) {
			newNode.next = null;
			newNode.prev = null;
			head = newNode;
		}else{
			Node last = head;
			while(last.next != null) {
				last = last.next;
			}
			last.next = newNode;
			newNode.prev = last;
		}
	}
	
	public void delete(int val) {
		if(head == null) {
			return;
		}
		Node temp = head;
		
		while(temp != null && temp.data != val){
            temp = temp.next;
        }
		
		if(temp == null) {
			System.out.println("No val has been found");
			return;
		}else if(temp == head) {
			head = head.next;
			head.prev = null;
		}else if(temp.next == null) {
			temp.prev.next = null;
		}else {
			temp.prev.next = temp.next;
			temp.next.prev = temp.prev;
		}
	}
	
	public static void main(String[] args) {
		LinkedList linkedlist = new LinkedList();
		
		linkedlist.addFirst(0);
		linkedlist.addFirst(1);
		linkedlist.addFirst(2);
		linkedlist.addLast(4);
		linkedlist.addLast(3);
		linkedlist.delete(4);
		
		linkedlist.printForward();
//		linkedlist.printReverse();
		
	}

//	public static void main(String[] args) {
//		Node head, middle, tail;
//		
//		head = new Node();
//		middle = new Node();
//		tail = new Node();
//		System.out.println(head.toString());
//		
//		head.data = 12;
//		middle.data = 14;
//		tail.data = 15;
//		
//		head.prev = null;
//		middle.prev = head;
//		tail.prev = middle;
//		
//		head.next = middle;
//		middle.next = tail;
//		tail.next = null;
//		
//		Node temp = head;
//		
//		while(temp != null) {
//			System.out.println(temp.data);
//			temp = temp.next;
//		}
//		System.out.println("Reversing the list");
//		Node rev = tail;
//		while(rev != null) {
//			System.out.println(rev.data);
//			rev = rev.prev;
//		}
//	}
	
}
package com.data_structure_problems.m_leet_code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

public class SumOfLinkedList {

	// This is an input class. Do not edit.
	static class LinkedList {
		public int value;
		public LinkedList next;

		public LinkedList(int value) {
			this.value = value;
			this.next = null;
		}
	}

	public LinkedList sumOfLinkedLists(LinkedList linkedListOne, LinkedList linkedListTwo) {
		int carry = 0;
		LinkedList newLinkedList = new LinkedList(0);
		LinkedList current = newLinkedList;
		while(linkedListOne != null || linkedListTwo != null){
			int sum = 0;
			if(linkedListOne != null){
				sum += linkedListOne.value;
				linkedListOne = linkedListOne.next;
			}
			if(linkedListTwo != null){
				sum += linkedListTwo.value;
				linkedListTwo = linkedListTwo.next;
			}
			if(carry != 0) sum++;
			if(sum > 10){
				sum = sum - 10;
				carry++;
			}else{
				carry = 0;
			}
			LinkedList newNode = new LinkedList(sum);
			current.next = newNode;
			current = newNode;
			if(carry > 0  && linkedListOne == null && linkedListTwo == null){
				LinkedList node = new LinkedList(carry);
				current.next = node;
				current = node;
			}
		}
		return current;
	}
	
	public static void main(String[] args) {
//		int[] ar = {2,4,7,1};
//		LinkedList list_1 = new LinkedList(0);
//		LinkedList head = list_1;
//		for (int i : ar) {
//			LinkedList list = new LinkedList(i);
//			list_1.next = list;
//			list_1 = list;
//		}
//		LinkedList list = head;
//		while(list != null) {
//			System.out.println(list.value);
//			list = list.next;
//		}
//		
////		SumOfLinkedList name = new SumOfLinkedList();
//		
////		HashMap<Integer, Integer> ht  = new HashMap<>();
////		ht.put(null, null);
//// 		ht.put(1, 1);
////		ht.put(2, 1);
////		ht.put(3, 1);
////		System.out.println(ht.toString());
////		
////		Hashtable<String, String> hT  = new Hashtable<>();
////		hT.put(null, null);
////		hT.put(null, null);
//		System.out.println(hT.toString());
	}
}
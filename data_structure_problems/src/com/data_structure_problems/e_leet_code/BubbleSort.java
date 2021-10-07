package com.data_structure_problems.e_leet_code;

import java.util.Arrays;

public class BubbleSort {

	public static int[] bubble(int[] array) {
		if(array.length <= 1) {
			return array;
		}
		for (int i = 0; i < array.length; i++) {
			boolean swip = false;
			for (int j = 1; j < array.length-i; j++) {
				if(array[j] < array[j-1]) {
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
					swip = true;
				}
			}
			if(!swip) {
				break;
			}
		}
		return array;
	}
	
	public static int[] bubble_1(int[] array) {
		if(array.length <= 1) {
			return array;
		}
		int count = 0;
		while(count < array.length) {
			boolean swip = false;
			for (int j = 1; j < array.length - count; j++) {
				if(array[j] < array[j-1]) {
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
					swip = true;
				}
			}
			if(!swip) {
				break;
			}
		}
		return array;
	}
 	
	public static void main(String[] args) {
//		int[] array = {5,4,3,2,1};
//		int[] array = {8,5,2,9,5,6,3};
		int[] array = {8,5,2,-4,9,5,6,3};
		bubble_1(array);
		System.out.println(Arrays.toString(array));
	}
	
}
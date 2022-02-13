package com.data_structure_problems.cyclic_sort;

import java.util.Arrays;

public class Problem_1 {
	
	public static void cyclicSort(int[] arr) {
		int i = 0;
		while(i < arr.length) {
			int correct = arr[i] - 1;
			if(arr[i] != arr[correct]) {
				swap(arr, i, correct);
			}else {
				i++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void swap(int arr[], int num_1, int num_2) {
		int temp = arr[num_1];
		arr[num_1] = arr[num_2];
		arr[num_2] = temp;
	}

	public static void main(String[] args) {
		int[] arr = {3,5,2,1,4};
		cyclicSort(arr);
	}
	
}
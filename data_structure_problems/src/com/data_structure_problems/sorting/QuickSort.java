package com.data_structure_problems.sorting;

import java.util.Arrays;

public class QuickSort {

	public static void sort(int[] nums, int low, int high) {
		if(low >= high) {
			return;
		}
		
		int s = low; //start index
		int e = high; // end index
		int m = s + (e - s)/2;
		int pivot = nums[m];
		
		while(s <= e) {
			while(nums[s] < pivot) {
				s++;
			}
			while(nums[e] > pivot) {
				e--;
			}
			if(s <= e) {
				int temp = nums[s];
				nums[s] = nums[e];
				nums[e] = temp;
				s++;
				e--;
			}
		}
		sort(nums, low, e);
		sort(nums, s, high);
	}
	
	public static void main(String[] args) {
		int arr[] = {4,5,3,1,2,8};
		System.out.println("Sethu");
		sort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
	
}
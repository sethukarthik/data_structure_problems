package com.data_structure_problems.cyclic_sort;

import java.util.Arrays;

public class FirstMissingPositive {
	public static int firstMissingPositive(int[] nums) {
		if(nums.length == 1) {
			return 2;
		}else if(nums.length == 0) {
			return 1;
		}
		int i = 0;
		while(i < nums.length){
			int index = nums[i] - 1;
			if(index <= nums.length && index >= 0 && nums[i] != nums[index]){
				swap(nums, i, index);
			}else{
				i++;
			}
		}

		System.out.println(Arrays.toString(nums));
		
		for(int j=0; j < nums.length; j++){
			if(j != nums[j] - 1)
				return (j + 1);
		}

		return nums.length;
	}

	public static void swap(int arr[], int num_1, int num_2) {
		int temp = arr[num_1];
		arr[num_1] = arr[num_2];
		arr[num_2] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {1};
		System.out.println(firstMissingPositive(arr));
	}
}
package com.data_structure_problems.cyclic_sort;

import java.util.Arrays;

public class MissingNumber_268 {

	public static int findMissingNumber(int[] nums) {
		int i = 0;
        while(i < nums.length){
            if(nums[i] < nums.length && i != nums[i]){
                swap(nums, i, nums[i]);
            }else{
                i++;
            }
            
        }
	    System.out.println(Arrays.toString(nums));
	    
        for(int j=0; j < nums.length; j++){
            if(nums[j] != j)
                return j;
        }
	        
        return nums.length;
	}
	
	public static void swap(int arr[], int num_1, int num_2) {
		int temp = arr[num_1];
		arr[num_1] = arr[num_2];
		arr[num_2] = temp;
	}
	
	public static void main(String[] args) {
//		int[] arr = {2,0,1};
//		int output = findMissingNumber(arr);
//		System.out.println(output);
	}
}
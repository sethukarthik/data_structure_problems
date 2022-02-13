package com.data_structure_problems.cyclic_sort;

import java.util.ArrayList;
import java.util.List;

public class Disappearing {

	public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while( i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
        
        List<Integer> disappeared = new ArrayList<>();
    
        for(int j=0; j < nums.length; j++){
            if(j != nums[j] - 1)
                disappeared.add(j + 1);
        }
        
        return disappeared;
    }
    
    public static void swap(int[] nums, int first, int last){
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
    }
    
    public static void main(String[] args) {
		int[] nums = {4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumbers(nums));
	}
	
}
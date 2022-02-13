package com.data_structure_problems.e_leet_code;

public class BitWiseAnd {
	
	public static int bitwise(int left, int right) {
		while(right > left) {
			right = right & right - 1;
		}
		return left & right;
	}
	
	static int rmDuplicates(int arr[], int n){

	    int newLength = 1;
	    
	    for(int i=1; i < n; i++){
	        if(arr[i-1] != arr[i])
	            newLength++;
	    }
	    return  newLength;

	}
	
	public static void main(String[] args) {
//		System.out.println(bitwise(16, 48));
//		System.out.println(-8 >>> 2);
		System.out.println(rmDuplicates(new int[] {5,5,10,10,20}, 5));
	}
}
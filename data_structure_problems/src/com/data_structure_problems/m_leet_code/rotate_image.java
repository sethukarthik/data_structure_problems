package com.data_structure_problems.m_leet_code;

import java.util.Arrays;

public class rotate_image {

	 public static void rotate(int[][] matrix) {
        int start = 0;
        
        while(start <= matrix.length-1){
            int[] arr = new int[matrix.length];
            int ind = 0;
            for(int i = matrix[start].length-1; i >= 0; i--){
                arr[ind] = matrix[i][start];
                ind++;
            }
            matrix[start] = arr;
            start = start + 1;
        }
        System.out.println(Arrays.deepToString(matrix));
    }
	 
	 public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(matrix[0][1]);
		rotate(matrix);
	}
	
}
package com.data_structure_problems.General;
import java.util.ArrayList;
import java.util.Arrays;


public class Solution {

	 public static int solution(int[] A) {
	     Arrays.sort(A);
	     int smallest_int = 1;
	     search: 
	     for(int i=1; i < A.length; i++){
	    	 if(A[i] <= 0 && A[i-1] <= 0) {
	    		 continue;
	    	 }
	    	 if(A[i] - A[i-1] >= 2){
	        	 smallest_int = A[i] - 1;
	        	 break search;
			 }
	         if(i == A.length - 1 && A[i] >= 0){
        		 smallest_int = A[i] + 1; 
	         }
	     }
	     return smallest_int;
 	}
	 
	 static int getSum(int n){
	     int sum = 0;
	     while (n != 0){
	         sum = sum + n % 10;
	         n = n / 10;
	     }
	     return sum;
	 }
	  
	 // Function to find the smallest
	 // number whose sum of digits is also N
	 public static int solution(int N) {
        int i=getSum(N);
        int d=i*2;
        int k=N;
        while (k<100000){
            if(getSum(k) == d){
                break;
            }
            k++;
        }
        return k;
	 }
	 
	 public int solution(String S, int[] C) {
	    int totalCost = 0;
	    char prev = S.charAt(0);
	    int maxCost = C[0];
	    int curTotalCost = C[0];
	    int length = S.length();
	    for (int i = 1; i < length; i++) {
	        char ch = S.charAt(i);
	        int curCost = C[i];
	        if (ch == prev) {
	            maxCost = Math.max(maxCost, curCost);
	            curTotalCost += curCost;
	        } else {
	            totalCost += curTotalCost - maxCost;
	            prev = ch;
	            maxCost = curCost;
	            curTotalCost = curCost;
	        }
	    }
	    totalCost += curTotalCost - maxCost;
	    return totalCost;
	 }
	 
	 public static void solve_2(int[] A, int[] B) {
		 Arrays.sort(A);
		 Arrays.sort(B);
        
        int i = 0;
        int j = 0;
        ArrayList<Integer> commonValue = new ArrayList<>();
        
        while(i < A.length && j < B.length){
            if(A[i] == B[j]){
                commonValue.add(A[i]);
            }
            if(A[i] < B[j]){
                i++;
            }else{
                j++;
            }
        }
        int[] array = new int[commonValue.size()];
        for(int a = 0; i < array.length; a++) {
        	array[a] = commonValue.get(a).intValue();
        }
        System.out.println(Arrays.toString(array));
    }
	 
	 public static void solve(int[] A) {
        int i=0;
        int j=1;
        int subArray = 0;
        while( i < A.length){
            subArray += A[i];
            if(subArray == 0){
                System.out.println(1);
            	break;
            }
            i++;
        }
        System.out.println(0);
    }
	 
	 public static void main(String[] args) {
//		 int[] A = {1,3,6,4,2,1};
//		 int output = solution(A);
//		System.out.println(output);
		 
//		 int N = 14;
//		 int op = solution(N);
//		 System.out.println(op);
		 
//		 int[] A = {74,9,51,51,75,0,35,89,96,77};
		 int B = 2;
//		 int[] A = {0,100,1};
//		 int[] B = {110,100,1};
//		 int[] A = {2,4,9,1,9,7,6,4,9};
		 int[] A = {5, 17, -22, 11};
		 solve(A);
	}
}
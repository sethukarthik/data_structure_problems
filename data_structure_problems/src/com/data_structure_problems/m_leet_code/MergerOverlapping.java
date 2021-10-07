package com.data_structure_problems.m_leet_code;

import java.util.ArrayList;
import java.util.Arrays;

public class MergerOverlapping {

	public static int[][] mergeOverlappingIntervals(int[][] intervals) {
		if(intervals.length <= 1) return intervals;
		int count = 0;
		int[] array = new int[intervals.length * intervals[0].length];
		//convert 2 dimension array into linear array
		for(int i=0; i < intervals.length; i++){
			for(int j=0; j < intervals[i].length; j++){
				array[count] = intervals[i][j];
				count += 1;
			}
		}
		System.err.println(Arrays.toString(array));
		//remove the overlapping
		int point1 = 0;
		int point2 = 1;
		ArrayList<Integer> list = new ArrayList<>();
		while(point1 < array.length){
			if((point1 == array.length-1) || array[point1] < array[point2]){
				list.add(array[point1]);
				point1 += 1;
				point2 += 1;
			}else{
				point1 += 2;
				point2 += 2;
			}
		}
		System.out.println(list);
		if(list.size() == 0) return new int[][] {};
		int[][] mergedOverlapArray = new int[list.size()/2][2];
		//Iterate the list and create a new 2-dimension array
		for(int i=0, j=0; i < list.size(); i=i+2){
			mergedOverlapArray[j][0] = list.get(i);
			mergedOverlapArray[j][1] = list.get(i+1);
			j++;
		}
    return mergedOverlapArray;
  }
	
	public static void main(String[] args) {
		int intervals[][] = {
				{100, 105},
				{1, 104}
		};
		
		int[][] output = mergeOverlappingIntervals(intervals);
		
		System.out.println(Arrays.deepToString(output));
	}
	
}
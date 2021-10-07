package com.data_structure_problems.m_leet_code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeHere {

	
	public static void main(String[] args) {
		List<int[]> name = new ArrayList<>();
		int[] va = {1,2,3};
		name.add(va);
//		System.out.println(name);
		
		//ArrayList to Array
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		Integer[] in = new Integer[list.size()];
		list.toArray(in);
		System.out.println(Arrays.toString(in));
		
		int x = 1;
		while(x > 3) {
			System.err.println("Asdf");
		}
		
	}
}
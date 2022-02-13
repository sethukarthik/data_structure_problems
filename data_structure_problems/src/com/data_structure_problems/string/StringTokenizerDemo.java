package com.data_structure_problems.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class StringTokenizerDemo {

	
	public static void StringTokenizerDemo(String str) {
		StringTokenizer st = new StringTokenizer(str, str, true);
		
		while (st.hasMoreTokens()) {
            System.out.print(st.nextToken() + "-");
        }
 
        System.out.println();
	}
	
	public static void stringSplit(String str) {
		String[] subStr = str.split(" ");
		System.out.println(Arrays.toString(subStr));
	}
	
	public static void main(String[] args) {
		String str = "GeekForGeeks";
		StringTokenizerDemo(str);
		String str1 = "Geek For Geeks";
		stringSplit(str1);		
	}
}
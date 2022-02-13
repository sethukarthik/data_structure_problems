package com.data_structure_problems.string;

public class ToCharaArray {

	public static void toCharArray(String str) {
		
		char[] ch = str.toCharArray();
		System.out.println(ch);
		
		// Traverse the character array
        for (int i = 0; i < ch.length; i++) {
            // Print current character
            System.out.print(ch[i] + " ");
        }
	}
	
	public static void main(String[] args) {
		String str = "GeekForGeeks";
		
		toCharArray(str);
	}
	
}
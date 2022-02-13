package com.data_structure_problems.string;

public class LongestPalindromics {

	public static String longestPalindromic(String str) {
		String longest = "";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j < str.length(); j++) {
				String subString = str.substring(i, j);
				if(subString.length() > longest.length() && isPalindromic(subString)) {
					longest = subString;
				}
			}
		}
		
		return longest;
	}
	
	public static boolean isPalindromic(String str) {
		int start = 0;
		int end = str.length()-1;
		while(end > start) {
			if(str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String string = "aba";
		System.out.println(longestPalindromic(string));
	}
	
}

package com.data_structure_problems.string;

public class LongestPalindrom2 {

	public static String longestPalindromicSubString(String str) {
		int[] currentLongest = {0, 1};
		for(int i= 1; i < str.length(); i++) {
			int[] odd = getLongestPalindromFrom(str, i - 1, i + 1);
			int[] even = getLongestPalindromFrom(str, i - 1, i);
			int[] longest = odd[1] - odd[0] > even[1] - even[0] ? odd : even;
			
			currentLongest = currentLongest[1] - currentLongest[0] > longest[1] - longest[0] ? currentLongest : longest;
		}
		
		return str.substring(currentLongest[0], currentLongest[1]);
	}
	
	public static int[] getLongestPalindromFrom(String str, int leftIdx, int rightIdx) {
		while(leftIdx >= 0 && rightIdx < str.length()) {
			if(str.charAt(leftIdx) != str.charAt(rightIdx)) {
				break;
			}
			leftIdx--;
			rightIdx++;
		}
		return new int[] {leftIdx + 1, rightIdx};
	}
	
	
	public static void main(String[] args) {
		String str = "noon";
		System.out.println(longestPalindromicSubString(str));
	}
	
}
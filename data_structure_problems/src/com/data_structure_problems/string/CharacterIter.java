package com.data_structure_problems.string;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class CharacterIter {

	
	public static void charIterator(String str) {
		CharacterIterator it = new StringCharacterIterator(str);
		
		while(it.current() != CharacterIterator.DONE) {
			System.out.print(it.current() + " ");
			it.next();
		}
	}
	
	public static void main(String[] args) {
		String str = "GeekForGeeks";
		
		charIterator(str);
	}
}
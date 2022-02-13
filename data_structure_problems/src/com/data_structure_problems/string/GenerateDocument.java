package com.data_structure_problems.string;

import java.util.HashMap;

public class GenerateDocument {

	public static boolean generateDocument(String characters, String document) {
		//Create a HashMap
		HashMap<Character, Integer> countCharacters = new HashMap<>();
		//Generate the HashMap with characters
		for(int i=0; i < characters.length(); i++){
			char getChar = characters.charAt(i);
			if(countCharacters.containsKey(getChar)){
				int count = countCharacters.get(getChar);
				countCharacters.replace(getChar, ++count);
			}else{
				countCharacters.put(getChar, 1);
			}
		}
		
		System.out.println(countCharacters);
		
		//Validate the document length with Hashmap
		for(int i=0; i < document.length(); i++){
			char getKey = document.charAt(i);
			if(countCharacters.containsKey(getKey)){
				int value = countCharacters.get(getKey);
				if(value == 0){
					return false;
				}else{
					countCharacters.replace(getKey, --value);
				}
			}else{
				return false;
			}
		}
		return true;
  }
  
  public static void main(String[] args) {
	String chara = "Bste!hetsi ogEAxpelrt x ";
	String doc = "AlgoExpert is the Best!";
	
//	System.out.println(generateDocument(chara, doc));
	HashMap<Character, Integer>  map = new HashMap<Character, Integer>();
	map.put('s', map.getOrDefault('s', 2) + 1);
	
	System.out.println(map);
  }
}
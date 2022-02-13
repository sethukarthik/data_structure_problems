package com.data_structure_problems.General;

public class JumpStatement {

	public static void breakUnlabled() {
		int num = 12;
		int[] arrayOfInts =  { 32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127 };
		
		boolean findIt = false;
		// break will terminate from the loop
		for(int i = 0; i < arrayOfInts.length; i++) {
			System.out.println(arrayOfInts[i]);
			for(int j = 0; j < arrayOfInts.length; j++) {
				System.out.println("Inner loop" + arrayOfInts[j]);
				if(arrayOfInts[i] == num && arrayOfInts[j] == num) {
					findIt = true;
					break;
				}
			}		
		}
		if(findIt) {
			System.out.println("Number is present in the array");
		}else {
			System.out.println("Number is not present in the array");
		}
	}
	
	public static void breakLabled() {
		int num = 12;
		int[] arrayOfInts =  { 32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127 };
		
		boolean findIt = false;
		// break will terminate from the loop
		
		sethu:
		for(int i = 0; i < arrayOfInts.length; i++) {
			System.out.println(arrayOfInts[i]);
			for(int j = 0; j < arrayOfInts.length; j++) {
				System.out.println("Inner loop" + arrayOfInts[j]);
				if(arrayOfInts[i] == num && arrayOfInts[j] == num) {
					findIt = true;
					break sethu;
				}
			}		
		}
		if(findIt) {
			System.out.println("Number is present in the array");
		}else {
			System.out.println("Number is not present in the array");
		}
	}
	
	public static void continueUnlabled() {
		String searchMe = "peter piper picked a " + "peck of pickled peppers";
		int max = searchMe.length();
		int numPs = 0;
		labl:
		for(int i =0; i < max; i++) {
			if(searchMe.charAt(i) != 'p')
				continue;
			numPs++;
		}
		
		System.out.println(numPs);
	}
	
	public static void continueLabled() {
		String searchMe = "Look for a substring in me";
        String substring = "sub";
        boolean foundIt = false;

        int max = searchMe.length() - 
                  substring.length();

    test:
        for (int i = 0; i <= max; i++) {
            int n = substring.length();
            int j = i;
            int k = 0;
            while (n-- != 0) {
            	if (searchMe.charAt(j++) != substring.charAt(k++)) {
                    continue test;
                }
                System.out.println(searchMe.charAt(j));
            }
            System.out.println("coming");
            foundIt = true;
            break test;
        }
    	System.out.println(foundIt ? "Found it" : "Didn't find it");
    }
	
	public static void main(String[] args) {
		//breakUnlabled();
		//breakLabled();
		//continueUnlabled();
		continueLabled();
	}
}
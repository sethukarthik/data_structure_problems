package com.data_structure_problems.e_leet_code;

public class DefangingIP {

	public static String defangIPaddr(String address) {
        String updatedIp = address.replaceAll(".", "2");
        return updatedIp;
    }
	
	public static void main(String[] args) {
		System.out.println(defangIPaddr("1.1.1.1"));
	}
	
}
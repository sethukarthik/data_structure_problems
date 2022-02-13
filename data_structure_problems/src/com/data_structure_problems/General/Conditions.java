package com.data_structure_problems.General;

public class Conditions {

	public static void switchStatment() {
		int month = 5;
		String monthName;
		
		switch(month) {
		case 1:
			monthName = "Jan";
			break;
		case 2:
			monthName = "Feb";
			break;
		case 3:
			monthName = "March";
			break;
		case 4:
			monthName = "April";
			break;
		default:
			monthName = "Other Months";
			break;
		}
		System.out.println(monthName);
	}
	
	public static void daysName() {
		int day = 51;
		String dayName;
		
		switch(day){
		default:
			dayName = "Invalid Data";
		case 1:
			dayName = "Sunday";
			System.out.println("coming");
		case 2:
			System.out.println("coming 1");
			dayName = "Monday";
		case 3:
			System.out.println("coming to 2");
			dayName = "Tue";
		case 4:
			dayName = "Wed";
		case 5:
			dayName = "Thur";
		}
		System.out.println(dayName);
	}
	
	public static void useLong() {
		String val = "DATE1";
		switch(val) {
		case "DATE":
			System.out.println("asdfs");
		}
	}
	
	public static void main(String[] args) {
//		switchStatment();
		daysName();
//		useLong();
	}
}
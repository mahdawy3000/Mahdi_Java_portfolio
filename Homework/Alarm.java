package Homework;

public class Alarm {

	public static void main(String args[]) {
		String alarmTime = alarmClock(0, false);
		System.out.println(alarmTime);
	}

	public static String alarmClock(int day, boolean vacation) {
	     if ( day > 0 && day < 6) {
	    	 if (vacation == true) {
	         return "10:00";
	       } else {
	         return "7:00";
	       }
	     } else {
	       if (vacation == true) { 
	         return "off";
	       } else {
	         return "10:00";
	       }
	     }
}
}
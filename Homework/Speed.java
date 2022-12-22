package Homework;

public class Speed {
	public static void main(String args[]) {
		int ticketEncode = caughtSpeeding(85, true);
		System.out.println(ticketEncode);
	}

	public static int caughtSpeeding(int speed, boolean isBirthday) {
	     int speedA = 0;
	      if (isBirthday == true) {
	        speedA = 5;
	      }
	      if (speed <= 60 + speedA) {
	        return 0;
	    } 
	      if (speed < 81 + speedA) {
	      return 1;

	    } 
	      return 2;
	    }
	}
	  
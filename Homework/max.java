package Homework;

public class max {

	public static void main(String args[]) {

		boolean isPartySuccessful = cigarParty(30, false);
		System.out.println("Is party wend well: " + isPartySuccessful);
	}

	public static boolean cigarParty(int cigars, boolean isWeekend) {
		if (cigars >= 40 && cigars <= 60) {
			return true;
		} else if (isWeekend) {
			return true;
		} else {
			return false;
		}
	}
}
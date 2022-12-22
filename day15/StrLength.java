package day15;

import util.InputFromUser;

public class StrLength {
	public static void main(String[] args) {
		String str = InputFromUser.getInput("Whats your name? ");
		
		int numberOfChars = str.length();
		System.out.println("Number of chars : " + numberOfChars);
		
		if (numberOfChars > 7) {
			System.out.println("you got a long name");
		}
	System.out.println("Nice to meet you");
	}

}

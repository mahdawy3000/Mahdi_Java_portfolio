package Homework;

public class in1to10 {

	public static void main(String args[]) {
		boolean res = in1To10(5, false);
		System.out.println(res);
	}

	public static boolean in1To10(int n, boolean outsideMode) {

if (outsideMode)
	return n <= 1 || n >=10;
	
	return n >= 1 && n <= 10;
	}
}

	

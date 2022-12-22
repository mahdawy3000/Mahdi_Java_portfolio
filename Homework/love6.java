package Homework;

public class love6 {

	public static void main(String args[]) {
		boolean res = love6(1, 7);
		System.out.println(res);
	}

	public static boolean love6(int a, int b) {
		return ( (a == 6 || b == 6) || (a + b == 6) || (Math.abs( a - b ) == 6 ));
    }
}
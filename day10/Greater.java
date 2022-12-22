package day10;

public class Greater {
	public static void main(String[] args) {
		double res = numb(155.5);
		System.out.println(res);
		double res1 = numb(50);
		System.out.println(res1);
	}

	public static double numb(double num) {
		if (num > 100) {
			return num;
		} else {
			return 100;
		}

	}
}

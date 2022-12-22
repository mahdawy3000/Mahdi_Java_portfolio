package Homework;

public class Fashion {

	public static void main(String args[]) {
		int result = dateFashion(3, 3);
		System.out.println("Result: " + result);
	}

	public static int dateFashion(int you, int date) {

	
		if ((you >= 8 && date > 2) || (date >= 8 && you > 2))

			return 2;

		if (you <= 2 || date <= 2)

			return 0;

		else

			return 1;

	}
}
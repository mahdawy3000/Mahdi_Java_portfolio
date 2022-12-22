package day15;

public class Grade {
	public static void main(String[] args) {
		
		displayScore('a'); // 90 - 100
		displayScore('A'); // 90 - 100
		displayScore('F'); // less than 50
		displayScore('B'); // 65 - 89
		displayScore('C'); // 50 - 64
		
		displayScore('x'); // not valid grade
		displayScore('Y'); // not valid grade
	}
	
	
	
	
	public static void displayScore(char grade) {
		switch(grade)	{
		case 'A' , 'a':
		System.out.println("90-100");
		break;
		case 'B' , 'b':
			System.out.println("65 - 89");
		break;
		case 'C' , 'c':
			System.out.println("50 - 64");
		break;
		case 'F' , 'f':
			System.out.println("less than 50");
		break;
		default:
		System.out.println("not valid grade");
		
		
		}
	
	}

}

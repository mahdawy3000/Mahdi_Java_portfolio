package day15;

public class ChangeStrPractice {
	public static void main(String[] args) {
		System.out.println(ChangeStr("Beknazar")); // BEKNAZAR 
		System.out.println(ChangeStr("John Doe")); // JOHN DOE 
		System.out.println(ChangeStr("JAVA")); // java
		System.out.println(ChangeStr("java")); // java
	
	
	}
	public static String ChangeStr(String str) {
		int length = str.length();
		return length > 5 ? str.toUpperCase() : str.toLowerCase();
	}
	
			
		}
		
	



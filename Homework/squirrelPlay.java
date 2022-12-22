package Homework;

public class squirrelPlay {
	public static void main(String[] args) {
        boolean isPlay = squirrelPlay(59, true);
        System.out.println(isPlay);
    }

    public static boolean squirrelPlay(int temp, boolean isSummer) {
    	if (temp >= 60 && temp <=90) {
    	
    	return true;
    	
    	} else if (isSummer && temp <= 100 && temp >=60) {
    	
    		return true;
		
    } else {  
			
			return false;
    }
}
}
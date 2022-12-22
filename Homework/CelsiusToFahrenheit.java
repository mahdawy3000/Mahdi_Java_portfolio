package Homework;

public class CelsiusToFahrenheit {

    public static void main (String[] args) {
        double fahrenheit = convertCelsiusToFahrenheit(41);
        System.out.println("Fahrenheit: "+fahrenheit);
    }

    public static double convertCelsiusToFahrenheit(int celsius){
        double fahrenheit = (double)(celsius * 9 )/5 + 32;
        return fahrenheit;
    }
}
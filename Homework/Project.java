package Homework;

public class Project {
    public static int num;

    public static void main (String[] args) { 
        int amount = 87;
        
        
      System.out.println(amount + " cents in coins:");
      int quarters = amount / 25;
      amount = amount % 25;
      
      int dimes = amount / 10;
      amount = amount % 10;
      
      int nickles = amount / 5;
      int pennies = amount % 5;
      
        
      System.out.println(quarters +  " quarters");
      System.out.println(dimes + " dimes");
      System.out.println(nickles + " nickles");
      System.out.println(pennies + " pennies");
      
      
    }
}
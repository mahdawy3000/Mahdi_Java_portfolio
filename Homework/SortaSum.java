package Homework;

public class SortaSum {

    public static void main(String args[]){
        int sum = sortaSum(10, 9);
        System.out.println(sum);
    }

    public static int sortaSum(int a, int b) {
     int sum = a + b;
      if (sum >= 10 && sum <= 19) {
        return 20;
    }
    return sum;
}
}
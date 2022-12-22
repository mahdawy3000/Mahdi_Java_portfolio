package Homework;

public class TeamPartie {


    public static void main(String args[]) {
        int res = teaParty(20, 6);
        System.out.println(res);
    }

    public static int teaParty(int tea, int candy) {
      if (tea >=5 && candy >=5){
        return 1;
    } else if (tea % 2 == candy){
        return 2;
      }else {
        return 0;
      }
}
}
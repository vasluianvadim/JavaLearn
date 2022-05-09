package WhilePack;

public class Exercise {
    public static void main(String[] args) {
  tenToFive();
//       tenToFiveDoWile();
    }
    public static void tenToFive(){
        int start= 10;
        int stop= 5;
        while(start>=stop){
            if(start%2==0) {
                System.out.println(start);
//
            }
//            System.out.println(start);
            start--;

        }
    }

    public static void tenToFiveDoWile(){
        int start=20;
        int stop=10;
        do {
            System.out.println(start);
            start=start-2;
        } while (start>=stop);
    }
}

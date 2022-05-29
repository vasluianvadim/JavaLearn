package Bubble;

public class Multipli {
    public static void main(String[] args) {


        int[] n = {1, 15, 30, 120, 35, 20};
        for (int i = 0; i < n.length; i++) {
            if (n[i] % 5 == 0)
                System.out.println(n[i]);
        }
    }
}
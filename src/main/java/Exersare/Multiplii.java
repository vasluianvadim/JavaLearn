package Exersare;

public class Multiplii {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = 15;
//        multipli(arr);
        try {
            divizori(n);
        }catch (Exception e){
        System.out.println("ArithmeticException");}
        finally {
            System.out.println("finally block is always executed");
        }
    }

    public static void multipli(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                System.out.println(arr[i]);
        }
    }

    public static void divizori(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.println(i);
        }
    }
}

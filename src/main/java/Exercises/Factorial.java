package Exercises;

public class Factorial {
    public static void main(String[] args) {

//        factorial(8);
        System.out.println(factorial(4));
    }
    public static int factorial (int a) {
//        int factorial = a;
        for (int i = a - 1; i > 0; i--) {
            a = a * i;


        }
        return a;

    }
}

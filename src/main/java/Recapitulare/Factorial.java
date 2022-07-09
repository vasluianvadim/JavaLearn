package Recapitulare;

public class Factorial {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(factorial(n));
//        fac();
    }

    static int factorial(int n) {
        for (int i = n - 1; i > 0; i--)
            n = n * i;

        return n;
    }
    static void fac(){
        int i,fact=1;
        int number=10;
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}


package Exersare;

public class Factorial {
    public static void main(String[] args) {
fact(5);
    }
    public static void fact(int n){
        for (int i=n-1;i>0;i--)
            n=n*i;
            System.out.println(n);
    }
}

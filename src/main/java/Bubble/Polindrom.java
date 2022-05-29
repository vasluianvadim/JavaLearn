package Bubble;

public class Polindrom {
    public static void main(String[] args) {
        int num = 12321;
        int rev = 0;
        int orNumber=num;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        if (orNumber == rev)
            System.out.println(orNumber + " este un polindrom ");
        else System.out.println(orNumber + " nu este polindrom");
    }
}

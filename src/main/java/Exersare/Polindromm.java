package Exersare;

public class Polindromm {
    public static void main(String[] args) {
        polindr("aba");

    }

    public static void polindr(String str) {
        String rev = "";
        char[] a = str.toCharArray();
        for (int i = a.length - 1; i >= 0; i--) {
            rev = rev + a[i];

        }
        if (str.equals(rev)) {
            System.out.println("Este polindrom");
        } else {
            System.out.println("Nu este polidrom");
        }

    }
}

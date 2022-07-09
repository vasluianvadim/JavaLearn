package Recapitulare;

public class Polindrom {
    public static void main(String[] args) {
        String name="bobi";
        char[] n=name.toCharArray();
        for(int i=n.length-1;i>=0;i--)
            System.out.print(n[i]);
    }

}

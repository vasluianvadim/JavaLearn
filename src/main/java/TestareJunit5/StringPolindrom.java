package TestareJunit5;

public class StringPolindrom {
    public static void main(String args[]) {
        strPolindr("mom");

    }
    public static boolean strPolindr(String str ){
        String rev="";
        for (int i = str.length() - 1; i >= 0; i--)
            rev = rev + str.charAt(i);

        if (str.equals(rev))
            return true;
        else
return false  ;  }
}

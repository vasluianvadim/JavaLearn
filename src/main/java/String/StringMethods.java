package String;

public class StringMethods {
    public static void main(String[] args) {
        String nume ="Aladin";


        System.out.println(nume.charAt(2));
        System.out.println(nume.compareTo("Jafar"));
        System.out.println(nume.compareToIgnoreCase("aladin"));
        System.out.println(nume.codePointAt(4));
        System.out.println(nume.length());
        System.out.println(nume.indexOf('a'));
        System.out.println(nume.codePointCount(1,4));
        System.out.println(nume.codePointAt(5));
        System.out.println(nume.equals("trat"));
        System.out.println(nume.toLowerCase());
        System.out.println(nume.toUpperCase());
        System.out.println(nume.concat(" Aladin"));

    }


}

package Exersare;

public class Palindrom {
    public static void main(String[] args) {
        String nume="moma";
//        String result = new StringBuffer(nume).reverse().toString();
//if(nume.equalsIgnoreCase(result)) System.out.println("este polindrom");
//else System.out.println("nu este polindrom");

        char[]num=nume.toCharArray();
        String reversed="";
        for (int i=num.length-1;i>=0;i--){
            reversed=reversed+num[i];

        }
        if(nume.equals(reversed)){
            System.out.println("Este polindrom");
        }else System.out.println("Nu este polindrom");

//            System.out.print(num[i]);

    }

}

package Exercises;


public class Reverse {
    public static void main(String[] args) {
        String nume = "batman";
//        System.out.println(revers(nume));
        System.out.print(reverse(nume));
    }

    public static String revers(String nume) {
        StringBuilder stringBuilder = new StringBuilder(nume);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
    public static String reverse(String text){
        char []a=text.toCharArray();
        char[]revers=new char[a.length];
        int arraylenght=a.length;
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
        int index=0;
        for (int i=a.length-1;i>=0;i--){
            revers[index]=a[i];
            index++;
        }
        for (int i=0;i<a.length;i++){
            System.out.print(revers[i]);
        }
        return "";

    }


}
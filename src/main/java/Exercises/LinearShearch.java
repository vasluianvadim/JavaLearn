package Exercises;

public class LinearShearch {
    public static void main(String[] args) {
        int[]list={1,5,6,7,8,3};
        int numer=6;
        for (int i=0;i< list.length;i++){
//            System.out.println(list[i]);
            if (list[i]==numer){
                System.out.println("Indexul numarului " + numer + " este " + i);
            }
        }
    }
}

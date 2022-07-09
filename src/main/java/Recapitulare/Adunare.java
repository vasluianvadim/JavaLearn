package Recapitulare;

public class Adunare {
    public static void main(String[] args) {
        int[] a = {5, 7, 3, 1,6,12,14, 7, 8, 9};
//        int sum = 0;
//        for (int i = 0; i < a.length; i++)
//            if (a[i] % 2 == 0)
//                sum = sum + a[i];
//        System.out.println(sum);
       adunareaPar(a);
//        adunareImpar(a);
    }

    static void adunareaPar(int[] a) {
        int sum=0;
        int sum2=0;
        for (int i=0;i< a.length;i++)
            if(a[i]%2==0)
                sum=sum+a[i];
        else sum2=sum2+a[i];
        System.out.println(sum);
        System.out.println(sum2);

    }
    static void adunareImpar(int[]a){
        int sum=0;
        for(int i=0;i<a.length;i++)
            if(a[i]%2==1)
                sum=sum+a[i];
        System.out.println(sum);
    }
}

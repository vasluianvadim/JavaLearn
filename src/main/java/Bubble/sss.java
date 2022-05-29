package Bubble;

public class sss {
    public static void main(String[] args) {
        int prod=1;
        int []a={1,2,3,4,5,6,7,8};
        for (int i=0;i< a.length;i++)
            if(a[i]%2==0)
                prod=prod*a[i];
        System.out.println(prod);
    }
}

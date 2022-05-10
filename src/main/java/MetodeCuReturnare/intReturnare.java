package MetodeCuReturnare;

public class intReturnare {
    public static void main(String[] args) {
        System.out.println(suma());
        System.out.println(maximum(4,5));
        System.out.println(maximum(34,56));
        System.out.println(produsul());
        System.out.println(adevarat());
        System.out.println(diferenta());
        System.out.println(produsull());
    }
//    returnare parametru
    public static int  maximum(int a,int b) {
        int max = 0;
        if (a > b) max=a;
        else max=b;
        return max;
    }
    public static int suma(){
        int a=4;
        int b=5;
        int suma;
        suma=a+b;
        return suma;
    }
    public static int produsul(){
        int a=4;
        int b=9;
       int produsul;
       produsul=4*9;
        return produsul;
    }
//    cu boolean nu am idee ce sa fac
    public static boolean adevarat(){
        boolean canaEstePlina=true;
        return canaEstePlina;
    }
public static double diferenta(){
        double a=2.3;
        double b=5.6;
        double diferenta=a-b;
        return diferenta;

    }
    public static double produsull(){
        double a=2.3;
        double b=5.6;
        double prod=a*b;
        return prod;

    }
}


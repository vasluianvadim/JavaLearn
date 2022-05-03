package TemaDeAcasa;

public class TemaMetoda {
    public static void main(String[] args) {
        System.out.println(method());
        System.out.println(method2());
        System.out.println(method3());
        System.out.println(method4());
        System.out.println(method5());
        System.out.println(method6());
        adunareaNumerelor();
        adunareaNumerelor1();
        adunareaNumerelor2();

    }

    //metode care returneaza int
    static int method() {
        int a = 1;
        int b = 2;
        int suma = a + b;
        return suma;
    }

    static int method2() {
        int c = 3;
        int d = 4;
        int produsul = c * d;
        return produsul;
    }

    static int method3() {
        int e = 8;
        int f = 2;
        int diferenta = e - f;
        return diferenta;
    }
//medode care returneaza String
    static String method4() {
        String nume = "Anton";
        return nume;
    }

    static String method5() {
        String nume1 = "Andrei";
        return nume1;
    }
    static String method6() {
        String nume2 = "Alina";
        return nume2;
    }

    static void adunareaNumerelor(){
        int m=3;
        int k = 4;
        int suma1= m+k;
        System.out.println(suma1);
    }
    static void adunareaNumerelor1(){
        int p=5;
        int l = 4;
        int suma1= p+l;
        System.out.println(suma1);
    }
    static void adunareaNumerelor2(){
        int s=6;
        int t = 4;
        int suma1= s+t;
        System.out.println(suma1);
    }

}
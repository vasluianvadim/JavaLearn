package Home_methods;

public class Metode {
    public static void main(String[] args) {
        method1();
        method2();
        System.out.println(method2());
        String numeString = method2();
        System.out.println(numeString);
        System.out.println(adunaNumere());
        int a = 7;
        System.out.println(a);
    }
   static void method1 (){
       System.out.println("text");
       System.out.println("text");
       System.out.println("text");
       System.out.println("text");
    }
    static String method2(){
        return "hello" ;
    }
   static int adunaNumere(){
        int suma = 2+3;
       return suma;
    }
}


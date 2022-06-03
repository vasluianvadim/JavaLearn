package TestareJunit5;

public class NumPare {
    public static void main(String[] args) {
        System.out.println(parSauImpar(5));
    }


    public static String parSauImpar(int number) {
        return number % 2 == 0 ? "par" : "impar";
    }

    public static boolean NumePareTest1(int number) {
        if (number % 2 == 0) return true;
  else return false;
    }

}


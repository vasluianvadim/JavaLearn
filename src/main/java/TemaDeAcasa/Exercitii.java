package TemaDeAcasa;

//import jdk.nashorn.internal.parser.Scanner;
import java.util.Scanner;
public class Exercitii {
    public static void main(String[] args) {
//        start point  = 20, stop point 5,
//                1. suma numerelor pare
//        2. suma numerelor impare
//      from20To5();
//      from20To5B();
//numereNaturale();
        ridicareLaPutere();
    }

    public static void from20To5() {
        int startPoint = 20;
        int stopPoin = 5;
        int suma = 0;
        while (startPoint >= stopPoin) {
            if (startPoint % 2 == 0) {
                suma = suma + startPoint;
                System.out.println("Suma totala este " + suma);
            }
            startPoint--;

        }
    }

    public static void from20To5B() {
        int startPoint = 20;
        int stopPoin = 5;
        int suma = 0;
        while (startPoint >= stopPoin) {
            if (startPoint % 2 == 1) {
                suma = suma + startPoint;
                System.out.println("Suma totala este " + suma);
            }
            startPoint--;
        }
    }

    public static void numereNaturale() {
        int a = 0;
        int b = 9;
        int suma = 0;
        while (a <= b) {
            suma = suma + a;
            a++;
        }
        System.out.println(suma);
    }

    public static void ridicareLaPutere() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu primul numar ");
        int numar = scanner.nextInt();
        System.out.println("Introdu al doilea numar ");
        int alDoileaNumar = scanner.nextInt();
        int rezultat = (int) Math.pow(numar,alDoileaNumar);
        System.out.print(numar + " raised to power " + alDoileaNumar + " is : ");
        System.out.print(rezultat);

        }

}


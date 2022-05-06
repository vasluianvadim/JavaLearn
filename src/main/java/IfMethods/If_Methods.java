package IfMethods;
import java.util.Scanner;

public class If_Methods {
    public static void main(String[] args) {

     //   System.out.println("Introdu numarul ");
       // int number = scanner.nextInt();
        pozitivNegativ();

   //     if (number >= 0) {
     //       System.out.println("Numarul este pozitiv ");
      //  } else if (number <= 0) {
        //    System.out.println("Numarul este negativ ");
     //   }
    }

    static void pozitivNegativ() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdu numarul ");
        int number = scanner.nextInt();
      //  int number=0;

        if (number >= 0) {
            System.out.println("Numarul este pozitiv ");
        } else if (number <= 0) {
            System.out.println("Numarul este negativ ");
        }




    }
}
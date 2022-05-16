package Exercises;
//Write a program to enter the numbers till the user wants and at the end it
// should display the count of positive , negative and zeros entered.


public class Exercitii1 {
    public static void main(String[] args) {
        int[]lista={2,5,10,-1,-4,5,12,0,1,0};
count(lista);
    }
    public static void count(int []a){
      int element=0 ;

        int counter=0;

        int lungime=a.length;
        for (int i=0;i<lungime;i++) {
            if (a[i] == element) {
                counter++;
            }
        }
           if (counter!=0) System.out.println("se contine de "+ counter +" ori");
                 else System.out.println("nu se contine");

    }
}

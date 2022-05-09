package Arrays;

public class ExercitiiWhileFor {
    public static void main(String[] args) {
        int sir[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int sir2[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
//        afisareCrescator(sir);
//        afisareDescrescator(sir2);
//        deLa7La3();
//          pare();
//        numerePare(sir);
//        numereImpare(sir);
        numereImpare(sir);
    }
    //        afisarea numerelor de la 1-12 - done
    public static void afisareCrescator(int array[]) {
        int lungime = array.length;
        for (int i = 0; i < lungime; i++) {

          System.out.println(array[i]);
        }
    }
    //        afisarea numerelor de la 15-1,
    public static void afisareDescrescator(int[] array) {
        int lungime = array.length;
        for (int i = lungime - 1; 0 <= i; i--) {

            System.out.println(array[i]);
        }
    }
    //         afisarea de la 7-3 - done
public static void deLa7La3(){
    int sir[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

   for (int i=7; i>=3;i--){
       System.out.println(i);

   }
}
//suma numerelor pare de la 1-10
public static void pare() {
    int sir[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    int suma = 0;
    int i = 0;

    for (i = 0; i <= 10; i++) {
        if (i % 2 == 0) {
           suma = suma + i;

        }
    }
    System.out.println(suma);
}
//        afisezi numerele pare din array,
public static void numerePare(int[] sir){
        int lungime=sir.length;
        for (int i=0;i<lungime;i++){
            if (i%2==0){
               System.out.println(i);
            }
        }
    }
    //                afisarea inversa doar numerele impare (parametru array int) 12-1
    public static void numereImpare(int[] sir2){
        int lungime = sir2.length;
        for (int i=lungime-1;i>=0;i--){
            if (i%2==1){
                System.out.println(i);
            }

        }

    }
}






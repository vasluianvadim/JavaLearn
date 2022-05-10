package Arrays;

public class arrayCreating {
    public static void main(String[] args) {
        int numere[]={1,2,3,4,5};
        String[] masini = {"camaro", "volvo", "bmw"};
        afisareInversa(numere);
//        afisareNormala(masini);
    }
    public static void arrayString() {
        String[] masini = {"camaro", "volvo", "bmw"};
        String[] masini2= new String[3];
        masini2[0]="camaro";
        masini2[1]="volvo";
        masini2[2]="bmw";

    }
    public static void afisareInversa(int array[]){
        int lungimeaArray= array.length;
        for (int index=lungimeaArray-1;index>=0;index--) {
            System.out.println(array[index]);

        }
        }
        public static void afisareNormala(String arrayNume[]){
        int lungimeaArray=arrayNume.length;
        for (int i=0;i<lungimeaArray;i++){
            System.out.println(arrayNume[i]);

        }


        }

    }



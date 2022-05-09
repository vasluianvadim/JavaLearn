package forClasses;

public class ForExample {
    public static void main(String[] args) {
//        afiseazaDeLaUnuLaCinci();
//        afiseazaArray();
//        int  numereNaturale [] = {0,1,2,3,4,5,6,7,8,9};
//        int numerePare[] = {2,4,6,8,10};
//        afiseazaArrayInt(numerePare);
//        afiseazaArrayInt(numereNaturale);

//        metodaAdunareDouaNumere();
        metodaAdunareDouaNumere(4,4);
        metodaAdunareDouaNumere(5,9);
        metodaAdunareDouaNumere(1,2);
    }

        public static void metodaAdunareDouaNumere(int primulNumar, int secondNumber){

        int suma = primulNumar+secondNumber;
        System.out.println("suma este: "+suma);
    }



//    public static void metodaAdunareDouaNumere(){
//        int a=4;
//        int b=4;
//        int suma = a+b;
//        System.out.println("suma este: "+suma);
//    }


    public static void afiseazaArrayInt(int oarecareArray[]){

        int lungimeaArray = oarecareArray.length;
        for(int indexStart=0;indexStart<lungimeaArray;indexStart++){
            System.out.println(oarecareArray[indexStart]);
        }
        System.out.println("--------------");
    }



//    public static void afiseazaArray(){
//        int  numereNaturale [] = {0,1,2,3,4,5,6,7,8,9};
//        int lungimeaArray = numereNaturale.length;
//
//        for(int index = 0;index<lungimeaArray;index++)
//        {
//            System.out.println(numereNaturale[index]);
//        }
//
//    }

    public static  void afiseazaDeLaUnuLaCinci(){
        for(int startPoint= 1;startPoint<=5;startPoint++){
            System.out.println(startPoint);
        }
    }



}

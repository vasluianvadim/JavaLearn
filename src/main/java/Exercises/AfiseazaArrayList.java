package Exercises;

public class AfiseazaArrayList {
    public static void main(String[] args) {
        int[] list = {3, 5, 7, 9, 1, 3,7 };
        char[]list2={'a','b','c','b','d','g'};
        existaNu(list2,'b');
//        existaNuExista(list2);
//        pesteUnul(list);
//        invers(list2);
//       jumatate(list);
        for (int i = 0; i < list.length; i++) {
//            System.out.println(list[i]);
//     for (int element :list){
//     System.out.println(element);
//       }
        }
    }
    public static void jumatate(int[]a){
//           for(int i=0;i< a.length/2;i++){
//            System.out.print(a[i]+ " ");
//        }
      if (a.length%2==0){
          for(int i=0;i< a.length/2;i++){
            System.out.print(a[i]+ " ");
        }
      }else {
          for(int i=0;i< a.length/2+1;i++){
          System.out.print(a[i]+ " ");
      }

      }
    }
    public static void invers(char[]a){
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
    }
    public static void pesteUnul(int[]a){
        for (int i=0;i<a.length;i=i+2){

            System.out.println(a[i]);
        }
    }
    public static void existaNuExista(char[]a){
        char element='b';
        for(int i=0;i<a.length;i++){
//            System.out.println(a[i]);
            if(a[i]==element)
            { System.out.println("lista2 contine "+ element);
                break;}

        }
    }
    public static void existaNu(char[]array,char element){
        int counter=0;
        for(int i=0;i< array.length;i++){

            if(array[i]==element){
                counter++;
            }
        }
        if(counter!=0) System.out.println("se contine de "+ counter+ " ori");
        else System.out.println("nu se contine");
    }

}





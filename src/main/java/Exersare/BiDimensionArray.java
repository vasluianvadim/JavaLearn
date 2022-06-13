package Exersare;

public class BiDimensionArray {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{2,4,5}};
        biDimensArray(arr);

    }
    static void biDimensArray(int arr[][]) {

       for(int i=0;i< arr.length;i++)
       for (int j=0;j<arr[i].length;j++)
           System.out.print(arr[i][j]+"      ");
    }

}

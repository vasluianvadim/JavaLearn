package Recapitulare;

public class Bidimensional {
    public static void main(String[] args) {
        int[][]array={{1,3,5},{5,8,9}};
        Bid(array);
    }
    static void Bid(int[][]a){
        for(int i=0;i<a.length;i++)
            for (int j=0;j<a[i].length;j++)
                System.out.print(a[i][j]+" ");
    }
}

package Exersare;

import java.util.Arrays;

public class BubbleNew {
    public static void main(String[] args) {
        int[] list = {3, 4, 5, 79, 1, 2, 8, 0};
        sortBubble(list);
        System.out.println(Arrays.toString(list));
    }

    public static void sortBubble(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                if (a[j]<a[j-1]){
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
        }
    }
}

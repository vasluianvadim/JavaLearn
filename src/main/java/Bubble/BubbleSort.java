package Bubble;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 4, 1, 2, 9, -5};
        bubleSort(array);
        for (int i : array)
            System.out.print(i + " ");

    }

    static void bubleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++)
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
        }
    }
}





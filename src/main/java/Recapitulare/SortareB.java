package Recapitulare;

public class SortareB {
    public static void main(String[] args) {
        int[] a = {5, 7, 3, 1, 7, 8, 9};
        sortare(a);
        for (int i : a) System.out.println(i);

    }

    static void sortare(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                if (a[j] < a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j-1] = temp;

                }
            }
        }
    }
}

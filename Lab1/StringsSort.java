package Lab1;

import java.util.Arrays;

public class StringsSort {
    public static void main(String[] args) {
        String[] a = {"BAC","CAB","ABC","ACB","CBA","BCA"};
        System.out.println("Before: " + Arrays.toString(a));
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length - 1; j++) {
                    if (a[j].compareTo(a[j+1]) > 0) {
                        String temp = a[j];
                        a[j] = a[j+1];
                        a[j+1] = temp;
                    }
                }
            }
            System.out.println("After:  " + Arrays.toString(a));
    }
}

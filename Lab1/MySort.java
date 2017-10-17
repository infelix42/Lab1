package Lab1;

import java.util.Arrays;

import static Lab1.MySearch.a;

public class MySort {
    public static int[] b = MySearch.insertArray(a);
    public static void main(String[] args) {
        System.out.println("Before: " + Arrays.toString(b));
        System.out.println("After:  " + Arrays.toString(sort(b)));
    }
    public static int[] sort(int[] b){
        for (int i = 0; i < MySort.b.length; i++) {
            int min = MySort.b[i];
            int imin = i;
            for (int j = i+1; j < MySort.b.length; j++) {
                if (MySort.b[j] < min) {
                    min = MySort.b[j];
                    imin = j;}
            }
            if (i != imin) {
                int temp = MySort.b[i];
                MySort.b[i] = MySort.b[imin];
                MySort.b[imin] = temp;
            }
        }return b;
    }
}


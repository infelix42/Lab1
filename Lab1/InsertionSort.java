package Lab1;

import java.util.Arrays;

import static Lab1.MySearch.a;

public class InsertionSort {
    static int[] c = MySearch.insertArray(a);
    public static void main(String[] args) {
        System.out.println("Before: " + Arrays.toString(c));
        for(int i=1;i<c.length;i++){
            for(int j=i; j>0 && c[j-1]>c[j];j--){
                int temp=c[j-1];
                c[j-1]=c[j];
                c[j]=temp;
            }
        }
        System.out.println("After:  " + Arrays.toString(c));
    }
}

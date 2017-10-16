package Lab1;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = MySearch.a;
        System.out.println("Before: " + Arrays.toString(a));
        for(int i=1;i<a.length;i++){
            for(int j=i; j>0 && a[j-1]>a[j];j--){
                int temp=a[j-1];
                a[j-1]=a[j];
                a[j]=temp;
            }
        }
        System.out.println("After:  " + Arrays.toString(a));
    }
}

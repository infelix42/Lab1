package Lab1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class StringsSort {
    public static String[] s;
    public static String[] insertArray(String[] s) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = input.nextInt();
        s = new String[size];
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            s[i] = reader.readLine();
        }
        return s;
    }
    public static void main(String[] args) throws IOException {
        String[] a = insertArray(s);
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

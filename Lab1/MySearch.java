package Lab1;

import java.util.Scanner;

public class MySearch {
    public static int[] a;
    public static int[] insertArray(int[] a) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = input.nextInt();
        a = new int[size];
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            a[i] = input.nextInt();
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr = insertArray(a);
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a number you want to find: ");
        int num = read.nextInt();

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == num){
                int temp = i+1;
                System.out.println("Your number is in position: " + temp + ". ^HappyFace.jpg^");
            break;}
            if (i == arr.length-1){
                if (arr[i] != num)
                    System.out.println("Number doesn't exist. ;SadFace.jpg;");
            }
        }
    }
}
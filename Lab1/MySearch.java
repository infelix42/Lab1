package Lab1;

import java.util.Scanner;

public class MySearch {
    public static int[] a = {5,2,4,1,3};
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a number you want to find: ");
        int num = read.nextInt();
        for (int i = 0; i <a.length ; i++) {
            if (a[i] == num){
                System.out.println("Your number is in position: " + i+1 + ". ^HappyFace.jpg^");
            break;}
            if (i == a.length-1){
                if (a[i] != num)
                    System.out.println("Number doesn't exist. ;SadFace.jpg;");
            }
        }
    }
}
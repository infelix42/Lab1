package Lab2;

import java.util.ArrayList;
import java.util.Scanner;

class FirstTask{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        System.out.println("Enter list's elements:");
        for (int i = 0; i < 10; i++) {
            String str = in.nextLine();
            strings.add(str);
        }
        for (int i = 0; i < 15; i++) {
            strings.add(0, strings.remove(9));
        }
        System.out.println("Enter 5 more elements to replace the last five from your list:");
        for (int i = 0; i < 5; i++) {
            String str = in.nextLine();
            strings.set(i+5, str);
        }
        System.out.println("Here is your modified list:");
        for (String i:strings) {
            System.out.println(i);
        }
    }
}

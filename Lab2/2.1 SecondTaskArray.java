package Lab2;

import java.util.ArrayList;
import java.util.Random;

class SecondTaskArray {
    public static void main(String[] args) {
        ArrayList<Random> stringsArr = new ArrayList<>();
        long nanoTime0 = System.nanoTime();
        long nanoTime;

        for (int i = 0; i < 100000; i++) {
            stringsArr.add(0, random);
        }
        nanoTime = System.nanoTime() - nanoTime0;
        System.out.println("Adding a new element to the start of the List: " + nanoTime);

        for (int i = 0; i < 100000; i++) {
            stringsArr.get(i);
        }
        nanoTime = System.nanoTime() - nanoTime0 - nanoTime;
        System.out.println("Reading each element on the List:              " + nanoTime);

        for (int i = 0; i < 100000; i++) {
            stringsArr.set(i, random);
        }
        nanoTime = System.nanoTime() - nanoTime0 - nanoTime;
        System.out.println("Overwriting each element on the List:          " + nanoTime);

        for (int i = 0; i < 100000; i++) {
            stringsArr.remove(0);
        }
        nanoTime = System.nanoTime() - nanoTime0 - nanoTime;
        System.out.println("Deleting first element on the List:            " + nanoTime);
    }

    private static Random random = new Random();
    static int generateRandom ( int n){
        return Math.abs(random.nextInt()) % n;
    }
}

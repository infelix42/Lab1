package Lab2;

import java.util.ArrayList;
import java.util.Random;

class SecondTaskArray {
    public static void main(String[] args) {
        ArrayList<Random> stringsArr = new ArrayList<>();

        long start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            stringsArr.add(0, random);
        }
        long stop = System.nanoTime();
        long result = stop - start;
        System.out.println("Adding a new element to the start of the List: " + result);

        start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            stringsArr.get(i);
        }
        stop = System.nanoTime();
        result = stop - start;
        System.out.println("Reading each element on the List:              " + result);

        start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            stringsArr.set(i, random);
        }
        stop = System.nanoTime();
        result = stop - start;
        System.out.println("Overwriting each element on the List:          " + result);

        start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            stringsArr.remove(0);
        }
        stop = System.nanoTime();
        result = stop - start;
        System.out.println("Deleting first element on the List:            " + result);
    }

    private static Random random = new Random();
    static int generateRandom ( int n){
        return Math.abs(random.nextInt()) % n;
    }
}

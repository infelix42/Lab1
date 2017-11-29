package Lab2;

import java.util.LinkedList;
import java.util.Random;

class SecondTaskLinked {
    public static void main(String[] args) {
        LinkedList<Random> stringsLink = new LinkedList<>();

        long start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            stringsLink.addFirst(random);
        }
        long stop = System.nanoTime();
        long result = stop - start;
        System.out.println("Adding a new element to the start of the List: " + result);

        start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            stringsLink.get(i);
        }
        stop = System.nanoTime();
        result = stop - start;
        System.out.println("Reading each element on the List:              " + result);

        start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            stringsLink.set(i,random);
        }
        stop = System.nanoTime();
        result = stop - start;
        System.out.println("Overwriting each element on the List:          " + result);

        start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            stringsLink.removeFirst();
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

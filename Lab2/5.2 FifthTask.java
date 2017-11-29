package Lab2;

import java.util.*;

class FifthTask2 {

    static TreeSet<Mate> brigadaT = new TreeSet<>();

    public static void main(String[] args) {
        brigadaT.add( new Mate("Alexey","Logvinov","ESTMu", 4));
        brigadaT.add( new Mate("Vitaliy","Marchukov","ESTMu", 4));
        brigadaT.add( new Mate("Vladislav","Lisichenko","ESTMu", 4));
        brigadaT.add( new Mate("Alexei","Rimar","ESTMu", 4));
        for (Mate i: brigadaT) {
            System.out.println(i.name);
        }
    }
}

class Mate implements Comparable<Mate>{

    String name;
    String lastName;
    String groupName;
    int brigadaNumber;

    public Mate(String name, String lastName, String groupName, int brigadaNumber) {
        this.name = name;
        this.lastName = lastName;
        this.groupName = groupName;
        this.brigadaNumber = brigadaNumber;
    }

    @Override
    public int compareTo(Mate that) {
        int result;
        int count = 0;
        for (char i: lastName.toCharArray()) {
            count++;
        }
        result = this.name.compareTo(that.name) + count;
        return result;
    }
}
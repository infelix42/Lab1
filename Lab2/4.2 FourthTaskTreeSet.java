package Lab2;

import java.util.ConcurrentModificationException;
import java.util.TreeSet;

class FourthTaskTreeSet {

    public static void main(String[] args) {
        int n = 0;
        TreeSet<String> students = new TreeSet<>();
        students.add("Andreev");
        students.add("Vinnichka");
        students.add("Grinenko");
        students.add("Dovgal");
        students.add("Drevalkyi");
        students.add("Juravskii");
        students.add("Klimidze");
        students.add("Kornienko");
        students.add("Kozlov");
        students.add("Labunskii");
        students.add("Logvinov");
        students.add("Lisichenko");
        students.add("Marchukov");
        students.add("Momot");

        System.out.println("Total students: " + students.size());
        for (String i: students) {
            n++;
            if(n == students.size()){
                System.out.print(i + ".");
                break;}
            System.out.print(i + ", ");
        }
        System.out.println("\n");

        for (int i = 0; i < 5; i++) {

            try {
                for (String a : students) {
                    students.remove(a);
                }
            } catch (ConcurrentModificationException e) { }

        }
        System.out.println("Total students: " + students.size());
        System.out.println(students);
    }
}

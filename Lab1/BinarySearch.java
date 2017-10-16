package Lab1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static Lab1.MySort.b;

public class BinarySearch {
    public static int[] c = MySort.sort(b);
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number you want to find: ");
        int num = Integer.parseInt(reader.readLine()); //Ввод искомого числа
        if (num < c[0] || num > c.length){
        System.out.println("Number doesn't exist. ;SadFace.jpg;");} //Если введенное число больше максимального числа в массиве, то выводится ошибка
        int i, min = 0, max = c.length, mid;
            while (min < max) {                      //Вход в цикл двоичного поиска, работающего до тех пор, пока кол-во итераций не достигнет кол-ва элементов массива
                mid = (min + max) / 2;               //Массив разбивается надвое в каждой итерации
                if (num == c[mid]) {
                    i = mid + 1;
                    System.out.println("Your number is in position: " + i + ". ^HappyFace.jpg^"); //Если введенное число совпадает со средним элементом, для данной итерации, то выводится номер позиции этого числа
                    break;
                } else if (num < c[mid]) {
                    max = mid;                       //Если введенное число меньше среднего элемента, для данной итерации, то этот элемент становится максимальным для последующей итерации
                } else min = mid;                    //Если же введенное число больше среднего элемента, для данной итерации, то этот элемент становится минимальным для последующей итерации
            }
    }
}



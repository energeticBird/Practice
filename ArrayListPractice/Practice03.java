package ArrayListPractice;

import java.util.ArrayList;
import java.util.Random;

public class Practice03 {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            int num = r.nextInt(100);
            list.add(num);
        }
        printArrayList(list);
        System.out.println();
        printArrayList(getEvenNumber(list));

    }

    public static ArrayList<Integer> getEvenNumber(ArrayList<Integer> integers) {
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) % 2 == 0) {
                smallList.add(integers.get(i));
            }
        }
        return smallList;
    }

    public static void printArrayList(ArrayList<Integer> list) {
        System.out.print("{ ");
        for (int i = 0; i < list.size(); i++) {
            if (i != list.size() - 1) {
                System.out.print(list.get(i) + ", ");
            }else {
                System.out.print("}");
            }
        }
    }
}

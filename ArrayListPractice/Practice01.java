package ArrayListPractice;

import java.util.ArrayList;
import java.util.Random;

public class Practice01 {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> l = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(33) + 1;
            l.add(num);
        }
        for (Integer integer : l) {
            System.out.println(integer);
        }

    }
}

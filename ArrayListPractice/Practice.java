package ArrayListPractice;

import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("张三丰");
        list.add("乔峰");
        list.add("张无忌");
        list.add("殷梨亭");

        printArrayList(list);
    }
    public static void printArrayList(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if (i < list.size() - 1) {
                System.out.print(list.get(i) + ", ");
            }else {
                System.out.print(list.get(list.size() - 1) + "}");
            }
        }
    }
}

package ArrayListPractice;

import ClassPractice.Student;

import java.util.ArrayList;

public class Practice02 {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        Student s1 = new Student("赵丽颖", 28);
        Student s2 = new Student("唐嫣", 20);
        Student s3 = new Student("杨幂", 32);
        Student s4 = new Student("柳岩", 36);

        s.add(s1);
        s.add(s2);
        s.add(s3);
        s.add(s4);

        for (Student student : s) {
            System.out.println(student.getName() + "：" + student.getAge());
        }
    }
}

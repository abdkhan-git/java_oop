package org.example;
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Abdullah", "Computer Science", 19);
        System.out.println(student.getName() + "\n" + student.getMajor() + "\n" + student.getAge());

        System.out.println();

        Student student2 = new Student("Billy", "Nursing", 23);
        System.out.println(student2.getName() + "\n" + student2.getMajor() + "\n" + student2.getAge());

        System.out.println();

        Student student3 = new Student();
        System.out.println(student3.getName() + "\n" + student3.getMajor() + "\n" + student3.getAge());

        System.out.println();

        Student student4 = new Student();
        student4.setName("Johnny");
        student4.setMajor("Physics");
        student4.setAge(21);
        System.out.println();
        System.out.println(student4.getName() + "\n" + student4.getMajor() + "\n" + student4.getAge());
    }
}
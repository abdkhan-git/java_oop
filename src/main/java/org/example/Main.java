package org.example;
public class Main {
    public static void main(String[] args) {
        // parameterized constructor
        Student student = new Student("Abdullah", "Computer Science", 19, "R012345678");
        System.out.println(student.getName() + "\n" + student.getMajor() + "\n" + student.getAge() + "\n" + student.getRamId());

        System.out.println();

        // second parameterized constructor
        Student student2 = new Student("Billy", "Nursing", 23, "R012345687");
        System.out.println(student2.getName() + "\n" + student2.getMajor() + "\n" + student2.getAge() + "\n" + student2.getRamId());

        System.out.println();

        // default constructor
        Student student3 = new Student();
        System.out.println(student3.getName() + "\n" + student3.getMajor() + "\n" + student3.getAge() + "\n" + student3.getRamId());

        System.out.println();

        // default constructor + setting values
        Student student4 = new Student();
        student4.setName("Johnny");
        student4.setMajor("Physics");
        student4.setAge(21);
        student4.setRamId("R901093193");
        System.out.println();
        System.out.println(student4.getName() + "\n" + student4.getMajor() + "\n" + student4.getAge() + "\n" + student4.getRamId());

    }
}
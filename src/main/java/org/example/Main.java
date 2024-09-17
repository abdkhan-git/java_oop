package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
//        // default constructor
//        Student student1 = new Student();
//        System.out.println(student1.getName() + "\n" + student1.getMajor() + "\n" + student1.getAge() + "\n" + student1.getRamId());
//
//        System.out.println();
//
//        // default constructor + setting values
//        Student student2 = new Student();
//        student2.setName("Johnny");
//        student2.setMajor("Physics");
//        student2.setAge(21);
//        student2.setRamId("R901093193");
//        System.out.println(student2.getName() + "\n" + student2.getMajor() + "\n" + student2.getAge() + "\n" + student2.getRamId());
//
//        System.out.println();
//
//        // parameterized constructor
//        Student student3 = new Student("Abdullah", "Computer Science", 19, "R012345678");
//        System.out.println(student3.getName() + "\n" + student3.getMajor() + "\n" + student3.getAge() + "\n" + student3.getRamId());
//        System.out.println();
//
//        // second parameterized constructor
//        Student student4 = new Student("Billy", "Nursing", 23, "R012345687");
//        System.out.println(student4.getName() + "\n" + student4.getMajor() + "\n" + student4.getAge() + "\n" + student4.getRamId());
//        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of your student");
        String name = scanner.nextLine();
        System.out.println(name.charAt(1));

        System.out.println("Enter the age of your student");
        int age = scanner.nextInt();
        System.out.println(age);



    }
}
package org.example;

public class Student {
    public String name;
    public String major;
    private int age;

    public Student() {
        System.out.println("Default Constructor");
        this.name = "Unknown";
        this.major = "None";
        this.age = 0;
    }

   public Student(String name, String major, int age) {
       System.out.println("Parameterized Constructor");
       setName(name);
       setMajor(major);
       setAge(age);
   }

   void setName(String name) {
       this.name = name;
   }

   String getName() {
       return name;
   }

   void setMajor(String major) {
       this.major = major;
   }

   String getMajor() {
       return major;
   }

   void setAge(int age) {
       this.age = age;
   }

   int getAge() {
       return age;
   }

}

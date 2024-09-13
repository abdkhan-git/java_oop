package org.example;

public class Student {
    // properties along with access modifiers
    public String name;
    public String major;
    private int age;
    private String ramId;

    // Default Constructor - this is what is called as soon as an object is created
    public Student() {
        System.out.println("Default Constructor");
        name = "Unknown"; // otherwise would be null
        major = "None"; // otherwise would be null
        age = 1; // otherwise would be 0
        ramId = "Unknown"; // otherwise would be null
    }

    // parameterized constructor
   public Student(String name, String major, int age, String ramId) {
       System.out.println("Parameterized Constructor");
       setName(name);
       setMajor(major);
       setAge(age);
       setRamId(ramId);
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

   void setRamId(String ramId) {
        this.ramId = ramId;
   }

   String getRamId() {
        return ramId;
   }

}

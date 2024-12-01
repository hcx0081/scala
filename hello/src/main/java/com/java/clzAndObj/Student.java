package com.java.clzAndObj;

/**
 * {@code @description:}
 */
public class Student {
    private static final String school = "xmu";
    private String name;
    private Integer age;
    
    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    
    public static void main(String[] args) {
        Student zs = new Student("zs", 20);
        Student ls = new Student("ls", 22);
        zs.printInfo();
        ls.printInfo();
    }
    
    private void printInfo() {
        System.out.println(this.name + " " + this.age + " " + Student.school);
    }
}

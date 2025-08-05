package UsingObjects;/*
Author: Azarya Silaen
 */

public class Student {
    private String name;
    private int age;

    //constructor
    public Student (String name, int age) {
        this.name = name;
        this.age = age;
    }

    //toString method
    @Override
    public String toString() {
        return "name = " + name + "\n" +
                "age = " + age;
    }

    //set and get
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;

    }
}

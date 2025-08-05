package UsingObjects;/*
Author: Azarya Silaen
 */

public class Student_Runner {

    public static void main(String[] args) {

        //using constructor
        Student student1 = new Student("Azarya", 15);
        Student student2 = new Student("tayler", 19);
        Student student3 = new Student("Brian", 20);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        /* using set and get
        student1.setName("Azarya");
        student1.setAge(15);
        student2.setName("Tayler");
        student2.setAge(19);
        student3.setName("Brian");
        student3.setAge(20);

        System.out.println("Name and age: " + student1.getName() + " " + student1.getAge());
        System.out.println("Name and age: " + student2.getName() + " " + student2.getAge());
        System.out.println("Name and age: " + student3.getName() + " " + student3.getAge());

         */
    }
}

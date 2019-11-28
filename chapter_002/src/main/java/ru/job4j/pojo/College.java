package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Vasiliy Orlov");
        student.setGroup("Group A");
        student.setData("September, 2010 year");
        System.out.println(student.getName() + " studies in a " + student.getGroup() + " with " + student.getData());
    }
}

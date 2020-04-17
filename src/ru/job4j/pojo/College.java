package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Petrov Aleksey");
        student.setGruppa("Stager");
        student.setDate("24.03.2020");
        System.out.println(student.getFio() + " - " + student.getGruppa() + " / " + student.getDate());
    }
}

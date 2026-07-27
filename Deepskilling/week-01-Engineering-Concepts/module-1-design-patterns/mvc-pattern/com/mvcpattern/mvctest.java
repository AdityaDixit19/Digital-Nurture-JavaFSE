package com.mvcpattern;

class Main {

    public static void main(String[] args) {

        Student student = new Student(101, "Rahul", "A");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(student, view);

        controller.updateView();

        System.out.println();

        controller.setStudentName("Amit");
        controller.setStudentGrade("A+");

        controller.updateView();
    }
}
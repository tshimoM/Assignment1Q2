/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentgrademanagementa1;
import java.util.AbstractList;
import java.util.Arrays;
/**
 *
 * @author RC_Student_lab
 */
class Classroom {
    private Student[] students;
    private int studentCount;

    // Constructor
    public Classroom(int size) {
        students = new Student[size];
        studentCount = 0;
    }

    // Method to add a student
    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount] = student;
            studentCount++;
        } else {
            System.out.println("Classroom is full!");
        }
    }

    // Method to rank students by average grade
    public void rankStudents() {
        Arrays.sort(students, 0, studentCount, (s1, s2) -> Double.compare(s2.getAverageGrade(), s1.getAverageGrade()));
    }

    // Method to generate a report
    public void generateReport() {
        rankStudents();
        System.out.println("Classroom Report:");
        // aranging students according to their averages
        for (int i = 0; i < studentCount; i++) {
            Student student = students[i];
            System.out.println((i + 1) + ". " + student.getName() + " - Average Grade: " + student.getAverageGrade());
        }
    }
    
}



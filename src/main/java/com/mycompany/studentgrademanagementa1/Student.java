/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentgrademanagementa1;

/**
 *
 * @author RC_Student_lab
 */
class Student {
     private String name;
    private int[] grades;
    private double averageGrade;

    // Constructor
    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
        this.averageGrade = calculateAverage();
    }

    // Method to calculate the average grade
    private double calculateAverage() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / (double) grades.length;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public int[] getGrades() {
        return grades;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentgrademanagementa1;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class StudentGradeManagementA1 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the maximum number of students for the classroom:");
        int maxStudents = Integer.parseInt(scanner.nextLine());
        Classroom classroom = new Classroom(maxStudents);

        System.out.println("How many students do you want to add?");
        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter the name of student " + (i + 1) + ":");
            String name = scanner.nextLine();

            System.out.println("Enter the grades for " + name + " separated by spaces:");
            String[] gradesInput = scanner.nextLine().split(" ");
            int[] grades = new int[gradesInput.length];

            for (int j = 0; j < gradesInput.length; j++) {
                grades[j] = Integer.parseInt(gradesInput[j]);
            }

            Student student = new Student(name, grades);
            classroom.addStudent(student);
        }

        // Generate and display the report
        classroom.generateReport();

        scanner.close();
    }
}

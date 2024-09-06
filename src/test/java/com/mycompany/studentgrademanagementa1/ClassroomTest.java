/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.studentgrademanagementa1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class ClassroomTest {
    
  
    /**
     * Test of addStudent method, of class Classroom.
     */
    @Test
    public void testAddStudent() {
        System.out.println("addStudent");
        Student student = null;
        Classroom instance = null;
        instance.addStudent(student);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rankStudents method, of class Classroom.
     */
    @Test
    public void testRankStudents() {
        System.out.println("rankStudents");
        Classroom instance = null;
        instance.rankStudents();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateReport method, of class Classroom.
     */
    @Test
    public void testGenerateReport() {
        System.out.println("generateReport");
        Classroom instance = null;
        instance.generateReport();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    StudentList studentList;

    @BeforeEach
    void setup() {
        studentList = new StudentList();
        studentList.addNewStudent("6710405100", "Skibidi Sigma", 85);
        studentList.addNewStudent("6710405101", "Skibidi Alpha", 70);
    }

    @Test
    @DisplayName("Add student with ID and Name")
    void testAddNewStudentWithIdAndName() {
        studentList.addNewStudent("6710405102", "Skibidi Beta");
        Student student = studentList.findStudentById("6710405102");
        assertNotNull(student, "Student should be added.");
    }

    @Test
    @DisplayName("Add student with ID, Name, and Score")
    void testAddNewStudentWithIdNameAndScore() {
        studentList.addNewStudent("6710405103", "Skibidi Gamma", 90);
        Student student = studentList.findStudentById("6710405103");
        assertNotNull(student, "Student should be added.");
    }

    @Test
    @DisplayName("Find student by ID")
    void testFindStudentById() {
        Student student = studentList.findStudentById("6710405100");
        assertNotNull(student, "Student should be found.");
    }

    @Test
    @DisplayName("Filter students by name")
    void testFilterByName() {
        StudentList filteredList = studentList.filterByName("Sigma");
        assertEquals(1, filteredList.getStudents().size(), "There should be 1 student.");
    }

    @Test
    @DisplayName("Give score to student by ID")
    void testGiveScoreToId() {
        studentList.giveScoreToId("6710405100", 10);
        Student student = studentList.findStudentById("6710405100");
        assertEquals(95, student.getScore(), "Score should be updated.");
    }

    @Test
    @DisplayName("View grade by student ID")
    void testViewGradeOfId() {
        String grade = studentList.viewGradeOfId("6710405100");
        assertEquals("A", grade, "Grade should be A.");
    }
}

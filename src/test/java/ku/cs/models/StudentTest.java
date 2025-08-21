package ku.cs.models;

import ku.cs.services.StudentHardCodeDatasource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s;

    @BeforeEach
    void setup() {
        s = new Student("6710405100", "Skibidi Sigma");
    }

    @Test
    @DisplayName("Add 45.15 points")
    void testAddScore() {
        s.addScore(45.15);
        assertEquals(45.15, s.getScore(), "Score should be 45.15.");
    }

    @Test
    @DisplayName("Add 85 points and check grade")
    void testCalculateGrade() {
        s.addScore(85);
        assertEquals("A", s.grade(), "Grade should be A.");
    }

    @Test
    @DisplayName("Change student name")
    void testChangeNameValid() {
        s.changeName("New Name");
        assertEquals("New Name", s.getName(), "Name should be updated.");
    }

    @Test
    @DisplayName("Try setting an empty name")
    void testChangeNameInvalid() {
        s.changeName("");
        assertEquals("Skibidi Sigma", s.getName(), "Name should not change.");
    }

    @Test
    @DisplayName("Check grade for 85 points")
    void testGradeA() {
        s.addScore(85);
        assertEquals("A", s.getGrade(), "Grade should be A.");
    }

    @Test
    @DisplayName("Check if ID matches")
    void testIsIdValid() {
        assertTrue(s.isId("6710405100"), "ID should match.");
    }

    @Test
    @DisplayName("Check if ID doesn't match")
    void testIsIdInvalid() {
        assertFalse(s.isId("1234567890"), "ID should not match.");
    }
}


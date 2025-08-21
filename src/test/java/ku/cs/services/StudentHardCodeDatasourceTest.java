package ku.cs.services;

import ku.cs.models.StudentList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentHardCodeDatasourceTest {
    StudentHardCodeDatasource datasource;

    @BeforeEach
    void setup() {
        datasource = new StudentHardCodeDatasource();
    }

    @Test
    @DisplayName("Read and add students from hardcoded data")
    void testReadData() {
        StudentList list = datasource.readData();

        assertNotNull(list, "The list should not be null.");
        assertEquals(4, list.getStudents().size(), "There should be 4 students.");

        assertEquals("6710400001", list.getStudents().get(0).getId(), "First student's ID should be 6710400001");
        assertEquals("First", list.getStudents().get(0).getName(), "First student's name should be 'First'");

        assertEquals("6710400002", list.getStudents().get(1).getId(), "Second student's ID should be 6710400002");
        assertEquals("Second", list.getStudents().get(1).getName(), "Second student's name should be 'Second'");

        assertEquals("6710400003", list.getStudents().get(2).getId(), "Third student's ID should be 6710400003");
        assertEquals("Third", list.getStudents().get(2).getName(), "Third student's name should be 'Third'");

        assertEquals("6710400004", list.getStudents().get(3).getId(), "Fourth student's ID should be 6710400004");
        assertEquals("Fourth", list.getStudents().get(3).getName(), "Fourth student's name should be 'Fourth'");
    }
}

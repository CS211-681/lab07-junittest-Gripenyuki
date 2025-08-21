package ku.cs.services;

import ku.cs.models.Student;
import ku.cs.models.StudentList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class StudentListHardCodeDatasourceTest {

    @Test
    void testReadData_size() {
        StudentListHardCodeDatasource datasource = new StudentListHardCodeDatasource();
        StudentList studentList = datasource.readData();

        assertEquals(10, studentList.getStudents().size(), "The list should contain exactly 10 students.");
    }

    @Test
    void testReadData_data() {
        StudentListHardCodeDatasource datasource = new StudentListHardCodeDatasource();
        StudentList studentList = datasource.readData();

        assertEquals("First", studentList.findStudentById("6710400001").getName());
        assertEquals("Second", studentList.findStudentById("6710400002").getName());
        assertEquals("Third", studentList.findStudentById("6710400003").getName());
        assertEquals("Fourth", studentList.findStudentById("6710400004").getName());
        assertEquals("Fifth", studentList.findStudentById("6710400005").getName());
        assertEquals("Sixth", studentList.findStudentById("6710400006").getName());
        assertEquals("Seventh", studentList.findStudentById("6710400007").getName());
        assertEquals("Eighth", studentList.findStudentById("6710400008").getName());
        assertEquals("Ninth", studentList.findStudentById("6710400009").getName());
        assertEquals("Tenth", studentList.findStudentById("67104000010").getName());
    }

    @Test
    void testReadData_defaultScore() {
        StudentListHardCodeDatasource datasource = new StudentListHardCodeDatasource();
        StudentList studentList = datasource.readData();

        Student student = studentList.findStudentById("6710400001");
        assertEquals(0.0, student.getScore());
    }
}
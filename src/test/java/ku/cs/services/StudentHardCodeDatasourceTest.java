package ku.cs.services;

import ku.cs.models.Student;
import ku.cs.models.StudentList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentHardCodeDatasourceTest {


    @Test
    void testReadData_size() {
        StudentHardCodeDatasource datasource = new StudentHardCodeDatasource();
        StudentList studentList = datasource.readData();

        assertEquals(4, studentList.getStudents().size());
    }

    @Test
    void testReadData_data() {
        StudentHardCodeDatasource datasource = new StudentHardCodeDatasource();
        StudentList studentList = datasource.readData();

        Student student1 = studentList.findStudentById("6710400001");
        Student student2 = studentList.findStudentById("6710400002");
        Student student3 = studentList.findStudentById("6710400003");
        Student student4 = studentList.findStudentById("6710400004");

        assertEquals("First", student1.getName() );
        assertEquals("Second", student2.getName());
        assertEquals("Third", student3.getName());
        assertEquals("Fourth", student4.getName());
    }

    @Test
    void testReadData_defaultScore() {
        StudentHardCodeDatasource datasource = new StudentHardCodeDatasource();
        StudentList studentList = datasource.readData();

        Student student = studentList.findStudentById("6710400001");
        assertEquals(0.0, student.getScore());
    }
}
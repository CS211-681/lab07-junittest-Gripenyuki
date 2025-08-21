package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    private StudentList s;

    @BeforeEach
    void setUp() {
        s = new StudentList();
        s.addNewStudent("6xxxxxxxx","test", 85.0);
        s.addNewStudent("7xxxxxxxx","test1", 70.0);
        s.addNewStudent("8xxxxxxxx","test2", 0);
    }

    @Test
    void testAddNewStudent() {
        int before = s.getStudents().size();
        s.addNewStudent("10xxxxxxxx","test1", 85.0);
        assertEquals(before + 1, s.getStudents().size());

    }

    @Test
    void findStudentById() {
        String id = "6xxxxxxxx";
        Student idName = s.findStudentById(id);
        assertEquals("test", idName.getName());
    }

    @Test
    void filterByName() {
        StudentList filteredList = s.filterByName("test");
        ArrayList<Student> students = filteredList.getStudents();

        assertEquals(3, students.size());

        assertEquals("test", students.get(0).getName());
        assertEquals("test1", students.get(1).getName());
        assertEquals("test2", students.get(2).getName());

        filteredList = s.filterByName("test1");
        students = filteredList.getStudents();
        assertEquals(1, students.size());
        assertEquals("test1", students.get(0).getName());
    }

    @Test
    void giveScoreToId() {
        s.giveScoreToId("8xxxxxxxx", 85.0);
        assertEquals(85.0, s.findStudentById("8xxxxxxxx").getScore());
    }

    @Test
    void viewGradeOfId() {
        assertEquals("A", s.viewGradeOfId("6xxxxxxxx"));
        assertEquals("B", s.viewGradeOfId("7xxxxxxxx"));
    }

    @Test
    void getStudents() {
        ArrayList<Student> students = s.getStudents();
        assertEquals("test", students.get(0).getName());
        assertEquals("test1", students.get(1).getName());
        assertEquals("test2", students.get(2).getName());
    }
}
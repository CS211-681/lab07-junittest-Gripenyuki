package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    static Student s;
/*    @BeforeAll
    static void initial() {
        s = new Student("6xxxxxxxx","test");
    }*/
    @BeforeEach
    void setUp() {
        s = new Student("6xxxxxxxx","test");
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 45.15 คะแนน")
    void testAddScore(){
        Student s = new Student("6xxxxxxxx", "StudentTest");
        s.addScore(45.15);
        assertEquals(45.15, s.getScore());

    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 85 คะแนน และให้ Object คำนวนเกรดออกมา")
    void testCalculateGrade_A(){
        Student s = new Student("6xxxxxxxxx", "StudentTest");
        s.addScore(85);
        assertEquals("A", s.grade());
    }
    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 70 คะแนน และให้ Object คำนวนเกรดออกมา")
    void testCalculateGrade_B(){
        Student s = new Student("6xxxxxxxxx", "StudentTest");
        s.addScore(70);
        assertEquals("B", s.grade());
    }
    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 60 คะแนน และให้ Object คำนวนเกรดออกมา")
    void testCalculateGrade_C(){
        Student s = new Student("6xxxxxxxxx", "StudentTest");
        s.addScore(60);
        assertEquals("C", s.grade());
    }
    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 50 คะแนน และให้ Object คำนวนเกรดออกมา")
    void testCalculateGrade_D(){
        Student s = new Student("6xxxxxxxxx", "StudentTest");
        s.addScore(50);
        assertEquals("D", s.grade());
    }
    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 0 คะแนน และให้ Object คำนวนเกรดออกมา")
    void testCalculateGrade_F(){
        Student s = new Student("6xxxxxxxxx", "StudentTest");
        s.addScore(0);
        assertEquals("F", s.grade());
    }

    @Test
    void testChangeName() {
        s.changeName("test1");
        assertEquals("test1", s.getName());
    }


    @Test
    void testIsId() {
        assertTrue(s.isId("6xxxxxxxx"));
    }

    @Test
    void isNameContains() {
        assertTrue(s.isNameContains("test"));
    }

}
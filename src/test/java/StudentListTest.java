import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class StudentListTest {
    private final ArrayList<Student> students = new ArrayList<>();
    private final StudentList studentList = new StudentList(students);

    @Test
    void testValidStudentList() {
        students.add(new Student("John Doe", "jdoe@email.com"));
        new StudentList(students);
    }

    @Test
    void testAddStudent() {
        studentList.addStudent(new Student("Chris Barry", "cbarry@gmit.ie"));
    }

    @Test
    void testFindStudentReturnsStudentObjectWhenFound() {
        studentList.addStudent(new Student("John Doe", "jdoe@email.com"));

        Student student = studentList.findStudent("John Doe");
        assertEquals("John Doe", student.getName());
    }

    @Test
    void testFindStudentReturnsNullWhenStudentNotFound() {
        assertNull(studentList.findStudent("Not Found"));
    }
}

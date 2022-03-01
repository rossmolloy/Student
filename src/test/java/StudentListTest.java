import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class StudentListTest {
    private final ArrayList<Student> students = new ArrayList<>();

    @Test
    void testValidStudentList() {
        Student student = new Student("John Doe", "jdoe@email.com");
        students.add(student);

        new StudentList(students);
    }

    @Test
    void testAddStudent() {
        StudentList studentList = new StudentList(students);

        Student student = new Student("Chris Barry", "cbarry@gmit.ie");
        studentList.addStudent(student);
    }
}

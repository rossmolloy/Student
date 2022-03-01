import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class StudentListTest {

    @Test
    void testValidStudentList() {
        Student student = new Student("John Doe", "jdoe@email.com");

        ArrayList<Student> students = new ArrayList<>();
        students.add(student);

        new StudentList(students);
    }
}

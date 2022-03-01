import java.util.ArrayList;

public class StudentList {
    private ArrayList<Student> students;

    public StudentList(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}

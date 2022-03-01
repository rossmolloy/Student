import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentTest {

    @Test
    void testValidStudent() {
        new Student("John Doe", "jdoe@email.com");
    }

    @Test
    void testNewStudentWithEmptyNameThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { new Student("", "jdoe@email.com"); });
        assertEquals("Invalid name, cannot be empty.", exception.getMessage());
    }

    @Test
    void testNewStudentWithEmptyEmailThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { new Student("John Doe", ""); });
        assertEquals("Invalid email, cannot be empty.", exception.getMessage());
    }
}

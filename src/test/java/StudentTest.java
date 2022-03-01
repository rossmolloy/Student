import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test
    void testValidStudent() {
        new Student("John Doe", "jdoe@email.com");
    }
}

public class Student {
    private String name;
    private String email;

    public Student(String name, String email) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Invalid name, cannot be empty.");
        } else {
            this.name = name;
        }

        if (email.isEmpty()) {
            throw new IllegalArgumentException("Invalid email, cannot be empty.");
        } else {
            this.email = email;
        }
    }
}

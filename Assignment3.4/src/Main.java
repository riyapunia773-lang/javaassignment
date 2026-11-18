
import java.io.*;

public class Main {

    public static void main(String[] args) {


        Student student = new Student(
                101,
                "John Smith",
                22
        );


        Course course = new Course(
                "ICT101",
                "Java Programming",
                "Michael Brown"
        );


        Enrollment enrollment = new Enrollment(
                student,
                course,
                "2026-11-18"
        );


        try (ObjectOutputStream output =
                     new ObjectOutputStream(
                             new FileOutputStream("enrollments.ser"))) {

            output.writeObject(enrollment);

            System.out.println("Enrollment serialized successfully!");

        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
        }


        try (ObjectInputStream input =
                     new ObjectInputStream(
                             new FileInputStream("enrollments.ser"))) {

            Enrollment restoredEnrollment =
                    (Enrollment) input.readObject();

            Student restoredStudent =
                    restoredEnrollment.getStudent();

            Course restoredCourse =
                    restoredEnrollment.getCourse();

            System.out.println("\nEnrollment deserialized successfully!");

            System.out.println("\nStudent Information:");
            System.out.println("ID: " + restoredStudent.getId());
            System.out.println("Name: " + restoredStudent.getName());
            System.out.println("Age: " + restoredStudent.getAge());

            System.out.println("\nCourse Information:");
            System.out.println("Course Code: " + restoredCourse.getCourseCode());
            System.out.println("Course Name: " + restoredCourse.getCourseName());
            System.out.println("Instructor: " + restoredCourse.getInstructor());

            System.out.println("\nEnrollment Information:");
            System.out.println("Enrollment Date: "
                    + restoredEnrollment.getEnrollmentDate());

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: " + e.getMessage());
        }
    }
}

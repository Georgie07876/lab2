import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class StudentApp {
    public static void main(String[] args) {
        StudentGroup group = new StudentGroup("PI-311",
                "KTSIA", 3, "full-time");

        group.addStudent(new Student("Иванов", "Иван", "Иванович", LocalDate.of(2001, 1, 15), "1234567890", "ivanov@mail.com"));
        group.addStudent(new Student("Петров", "Петр", "Петрович", LocalDate.of(2002, 2, 20), "0987654321", "petrov@mail.com"));
        group.addStudent(new Student("Сидоров", "Сидор", "Сидорович", LocalDate.of(2000, 3, 25), "1122334455", "sidorov@mail.com"));

        System.out.println(group);

        List<Student> olderStudents = group.getStudents().stream().filter(student -> LocalDate.now().getYear() - student.getDateOfBirth().getYear() > 22)
                .collect(Collectors.toList());

        System.out.println("Студенты старше 22 лет:");
        olderStudents.forEach(System.out::println);
    }

}

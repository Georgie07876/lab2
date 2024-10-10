import java.util.ArrayList;
import java.util.List;

class StudentGroup {
    private String name;
    private String faculty;
    private int course;
    private String educationType;
    private List<Student> students;

    public StudentGroup(String name, String faculty, int course,
                        String educationType) {
        this.name = name;
        this.faculty = faculty;
        this.course = course;
        this.educationType = educationType;
        this.students = new ArrayList<>();
        }
        public void addStudent(Student student) {
            students.add(student);
        }
        public List<Student> getStudents() {
            return students;
        }
        @Override
    public String toString() {
        return String.format("Группа: %s, Факультет: %s, Курс: %d, Вид обучения: %s",
                name, faculty, course, educationType);
    }
    }
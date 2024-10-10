import java.time.LocalDate;
class Student {
    private String lastName;
    private String firstName;
    private String middleName;
    private LocalDate dateOfBirth;
    private String phone;
    private String email;

    public Student(String lastName, String firstName, String middleName,
                   LocalDate dateOfBirth, String phone, String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.dateOfBirth =dateOfBirth;
        this.phone = phone;
        this.email = email;
    }

    public String getLastName() {return lastName;}
    public String getFirstName() {return firstName;}
    public String getMiddleName() {return middleName;}
    public LocalDate getDateOfBirth() {return dateOfBirth;}
    public String getPhone() {return phone;}
    public String getEmail() {return email;}

    @Override
    public String toString() {
        return String.format("%s %s %s, Дата рождения: %s, Телефон: %s, E-mail: %s",
                lastName, firstName, middleName, dateOfBirth, phone, email);


    }
}


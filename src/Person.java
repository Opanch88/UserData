import java.time.LocalDate;

public class Person {
    String lastName;
    String firstName;
    String patronymic;
    LocalDate dateBirth;
    String phoneNumber;
    Gender gender;

    public enum Gender {
        MALE,
        FEMALE
    }

    public Person(String lastName, String firstName, String patronymic, LocalDate dateBirth, String phoneNumber, Gender gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.dateBirth = dateBirth;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String toString() {
        return String.format("<%s><%s><%s><%s><%s><%s>",
                lastName,
                firstName,
                patronymic,
                dateBirth,
                phoneNumber,
                gender);
    }
}
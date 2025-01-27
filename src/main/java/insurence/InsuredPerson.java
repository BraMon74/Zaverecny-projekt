package insurence;

public class InsuredPerson {

    private String firstName;
    private String lastName;
    private int age;
    private String phoneNumber;

    public InsuredPerson(String firstName, String lastName, int age, String phoneNumber) {
        if (firstName == null || firstName.isBlank() || !firstName.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("First name must contain only letters and cannot be empty.");
        }
        if (lastName == null || lastName.isBlank() || !lastName.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Last name must contain only letters and cannot be empty.");
        }
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be a positive number.");
        }
        if (phoneNumber == null || phoneNumber.isBlank()) {
            throw new IllegalArgumentException("Phone number cannot be empty.");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + ", Age: " + age + ", Phone: " + phoneNumber;
    }
}

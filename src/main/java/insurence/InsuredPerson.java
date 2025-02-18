package insurence;

public class InsuredPerson {

    // Trieda reprezentuje poistenú osobu s menom, priezviskom, vekom a telefónnym číslom.
    private String firstName;
    private String lastName;
    private int age;
    private String phoneNumber;

    public InsuredPerson(String firstName, String lastName, int age, String phoneNumber) {

        //Kontrola, či krstné meno nie je prázdne a obsahuje iba písmená
        if (firstName == null || firstName.isBlank() || !firstName.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("First name must contain only letters and cannot be empty.");
        }

        // Kontrola, či priezvisko nie je prázdne a obsahuje iba písmená
        if (lastName == null || lastName.isBlank() || !lastName.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Last name must contain only letters and cannot be empty.");
        }

        // Kontrola, či vek je kladné číslo
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be a positive number.");
        }

        // Kontrola, či telefónne číslo nie je prázdne
        if (phoneNumber == null || phoneNumber.isBlank()) {
            throw new IllegalArgumentException("Phone number cannot be empty.");
        }

        // Inicializácia atribútov objektu
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    // Metóda na získanie krstného mena poistenej osoby.
    public String getFirstName() {
        return firstName;
    }

    // Metóda na získanie priezviska poistenej osoby
    public String getLastName() {
        return lastName;
    }

    // Metóda na získanie textovej reprezentácie objektu.
    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + ", Age: " + age + ", Phone: " + phoneNumber;
    }
}

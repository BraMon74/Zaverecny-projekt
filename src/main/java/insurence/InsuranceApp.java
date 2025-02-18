package insurence;
import java.util.List;
import java.util.Scanner;

public class InsuranceApp {

    // Inštancia služby na správu poistených osôb
    private static InsuranceService service = new InsuranceService(new InsuranceRepository());

    // Scanner na čítanie vstupu od používateľa
    private static Scanner scanner = new Scanner(System.in);

    // Opakuje zobrazovanie menu a vykonáva akcie podľa výberu používateľa.
    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice = Integer.parseInt(scanner.nextLine());

            // Spracovanie voľby pomocou switch
            switch (choice) {
                case 1:
                    createInsuredPerson();
                    break;
                case 2:
                    displayAllInsuredPersons();
                    break;
                case 3:
                    findInsuredPerson();
                    break;
                case 4:
                    System.out.println("Exiting application.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Zobrazí menu aplikácie.
    private static void showMenu() {
        System.out.println("\nInsurance Application Menu:");
        System.out.println("1. Create Insured Person");
        System.out.println("2. Display All Insured Persons");
        System.out.println("3. Find Insured Person");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    // Metóda na vytvorenie novej poistenej osoby. Číta údaje od používateľa.
    private static void createInsuredPerson() {
        try {
            System.out.print("Enter first name: ");
            String firstName = scanner.nextLine();

            System.out.print("Enter last name: ");
            String lastName = scanner.nextLine();

            System.out.print("Enter age: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter phone number: ");
            String phoneNumber = scanner.nextLine();

            // Vytvorenie a uloženie osoby do databázy
            service.createInsuredPerson(firstName, lastName, age, phoneNumber);
            System.out.println("Insured person created successfully.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Metóda na zobrazenie všetkých poistených osôb.
    private static void displayAllInsuredPersons() {
        List<InsuredPerson> persons = service.getAllInsuredPersons();
        if (persons.isEmpty()) {
            System.out.println("No insured persons found.");
        } else {
            for (InsuredPerson person : persons) {
                System.out.println(person);
            }
        }
    }

    // Metóda na vyhľadanie poistenej osoby podľa mena a priezviska.
    private static void findInsuredPerson() {
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        // Vyhľadanie osoby v databáze
        InsuredPerson person = service.findInsuredPerson(firstName, lastName);
        if (person == null) {
            System.out.println("Insured person not found.");
        } else {
            System.out.println(person);
        }
    }
}


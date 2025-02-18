package insurence;

import java.util.ArrayList;
import java.util.List;

// Trieda slúži ako repozitár na správu zoznamu poistených osôb.
public class InsuranceRepository {

        // Zoznam, v ktorom sa uchovávajú všetky poistené osoby
        private List<InsuredPerson> insuredPersons = new ArrayList<>();

        // Pridá novú poistenú osobu do zoznamu.
        public void addInsuredPerson(InsuredPerson person) {
            insuredPersons.add(person);
        }

        // Vráti všetky poistené osoby v zozname.
        public List<InsuredPerson> getAllInsuredPersons() {
            return new ArrayList<>(insuredPersons);
        }

        // Vyhľadá poistenú osobu podľa mena a priezviska.
        public InsuredPerson findInsuredPerson(String firstName, String lastName) {
            for (InsuredPerson person : insuredPersons) {
                if (person.getFirstName().equalsIgnoreCase(firstName) &&
                        person.getLastName().equalsIgnoreCase(lastName)) {
                    return person;
                }
            }
            // Ak osoba neexistuje, vráti null
            return null;
        }
    }


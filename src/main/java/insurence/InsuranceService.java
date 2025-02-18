package insurence;
import java.util.List;

// Poskytuje metódy na pridanie, získanie a vyhľadanie osoby.
public class InsuranceService {

        private InsuranceRepository repository;

    // Konštruktor, ktorý inicializuje službu s daným repozitárom.
        public InsuranceService(InsuranceRepository repository) {
            this.repository = repository;
        }

        // Vytvorí novú poistenú osobu a pridá ju do repozitára.
        public void createInsuredPerson(String firstName, String lastName, int age, String phoneNumber) {
            InsuredPerson person = new InsuredPerson(firstName, lastName, age, phoneNumber);
            repository.addInsuredPerson(person);
        }

        // Vráti zoznam všetkých poistených osôb.
        public List<InsuredPerson> getAllInsuredPersons() {
            return repository.getAllInsuredPersons();
        }

        // Vyhľadá poistenú osobu podľa mena a priezviska.
        public InsuredPerson findInsuredPerson(String firstName, String lastName) {
            return repository.findInsuredPerson(firstName, lastName);
        }
    }


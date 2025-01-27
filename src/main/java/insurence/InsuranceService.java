package insurence;
import java.util.List;

public class InsuranceService {

        private InsuranceRepository repository;

        public InsuranceService(InsuranceRepository repository) {
            this.repository = repository;
        }

        public void createInsuredPerson(String firstName, String lastName, int age, String phoneNumber) {
            InsuredPerson person = new InsuredPerson(firstName, lastName, age, phoneNumber);
            repository.addInsuredPerson(person);
        }

        public List<InsuredPerson> getAllInsuredPersons() {
            return repository.getAllInsuredPersons();
        }

        public InsuredPerson findInsuredPerson(String firstName, String lastName) {
            return repository.findInsuredPerson(firstName, lastName);
        }
    }


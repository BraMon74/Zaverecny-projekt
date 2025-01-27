package insurence;

import java.util.ArrayList;
import java.util.List;

public class InsuranceRepository {

        private List<InsuredPerson> insuredPersons = new ArrayList<>();

        public void addInsuredPerson(InsuredPerson person) {
            insuredPersons.add(person);
        }

        public List<InsuredPerson> getAllInsuredPersons() {
            return new ArrayList<>(insuredPersons);
        }

        public InsuredPerson findInsuredPerson(String firstName, String lastName) {
            for (InsuredPerson person : insuredPersons) {
                if (person.getFirstName().equalsIgnoreCase(firstName) &&
                        person.getLastName().equalsIgnoreCase(lastName)) {
                    return person;
                }
            }
            return null;
        }
    }


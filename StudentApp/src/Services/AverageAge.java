package Services;

import Domen.Person;

import java.util.List;

public class AverageAge<T extends Person> {

    public double calculateAverageAge(List<T> people) {
        if (people == null || people.isEmpty()) {
            return 0;
        }

        double sum = 0;
        for (T person : people) {
            sum += person.getAge();
        }

        return sum / people.size();
    }
}
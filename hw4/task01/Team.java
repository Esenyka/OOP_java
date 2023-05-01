package hw4.task01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Person> implements Iterable<T> {
    List<T> people = new ArrayList<>();

    @Override
    public Iterator<T> iterator() {
        return people.iterator();
    }

    public Team<T> addPerson(T person) {
        people.add(person);
        return this;
    }

    @Override
    public String toString() {
        return "Team{" +
                "people=" + people +
                '}';
    }

    public int maxRange(){
        int max = 0;
        for (T person: this) {
            if (person instanceof Archer){
                Archer ar = (Archer) person;
                if (ar.getRange() > max){
                    max = ar.getRange();
                }
            }
        }
        return max;
    }

}

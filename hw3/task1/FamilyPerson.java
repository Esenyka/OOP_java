package hw3.task1;

import java.util.Iterator;

public abstract class FamilyPerson implements Iterator<String> {
    protected String surname;
    protected String name;
    protected String gender;
    protected int age;
    int index;


    public FamilyPerson(String surname, String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.surname = surname;
    }


    public String getInfo() {
        return String.format("surname: %s, name: %s, gender: %s, age: %d",this.surname, this.name, this.gender, this.age);

    }

    public String isRelative(FamilyPerson p){
        String s = p.surname;
        if (s.equals(this.surname)){
            return String.format("Person: %s %s is relative Person: %s %s",
                    p.surname, p.name, this.surname, this.name);
        }
            return String.format("Person: %s %s is not relative Person: %s %s",
                    p.surname, p.name, this.surname, this.name);
        }
    public abstract String GetPersonStatus();

    @Override
    public boolean hasNext() {
        return index++ < 4;
    }

    @Override
    public String next() {
        return switch (index) {
            case 1 -> "Surname - " + surname;
            case 2 -> "Name - " + name;
            case 3 -> "Gender - " + gender;
            default -> "Age - " + age;
        };
    }
}

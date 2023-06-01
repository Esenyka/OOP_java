package hw2.task01;

public class FamilyPerson implements Status{
    protected String surname;
    protected String name;
    protected String gender;
    protected int age;


    public FamilyPerson(String surname, String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.surname = surname;
    }

    @Override
    public String SetPersonStatus() {
        return null;
    }
}

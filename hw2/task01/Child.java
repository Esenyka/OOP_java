package hw2.task01;

public class Child extends FamilyPerson implements Status{
    protected String status;

    public Child(String surname, String name, String gender, int age){
        super(surname, name, gender, age);
    }

    @Override
    public String SetPersonStatus() {
        String g = super.gender;
        g = g.toLowerCase();
        if (g.equals("female")){
            return this.status = "Daughter";
        }
        return this.status = "Son";
    }

}

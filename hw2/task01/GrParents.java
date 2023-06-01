package hw2.task01;

public class GrParents extends FamilyPerson implements Status{

    protected String status;

    public GrParents(String surname, String name, String gender, int age){
        super(surname, name, gender, age);
    }

    @Override
    public String SetPersonStatus() {
        String g = super.gender;
        g = g.toLowerCase();
        if (g.equals("female")){
            return this.status = "Grand Mother";
        }
        return this.status = "Grand Father";
    }

}

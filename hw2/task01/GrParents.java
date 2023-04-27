package hw2.task01;

public class GrParents extends FamilyPerson {

    protected String status;

    public GrParents(String surname, String name, String gender, int age){
        super(surname, name, gender, age);
    }

    public String getInfo() {
        String g = super.gender;
        g = g.toLowerCase();
        if (g.equals("female")){
            this.status = "Grand Mother";
            return String.format("Info:%s  Status: %s",super.getInfo(), this.status);
        }
        this.status = "Grand Father";
        return String.format("Info:%s  Status: %s",super.getInfo(), this.status);
    }

    public String GetPersonStatus(){
        String g = super.gender;
        g = g.toLowerCase();
        if (g.equals("female")){
            return this.status = "Grand Mother";
        }
        return this.status = "Grand Father";
    }

}

package hw2.task01;

public class Parent extends FamilyPerson{
    protected String status;

    public Parent(String surname, String name, String gender, int age){
        super(surname, name, gender, age);
    }

    public String GetInfo() {
        String g = super.gender;
        g = g.toLowerCase();
        if (g.equals("female")){
            this.status = "Mother";
            return String.format("Info:%s  Status: %s",super.getInfo(), this.status);
        }
        this.status = "Father";
        return String.format("Info:%s  Status: %s",super.getInfo(), this.status);
    }
    public String GetPersonStatus(){
        String g = super.gender;
        g = g.toLowerCase();
        if (g.equals("female")){
            return this.status = "Mother";
        }
        return this.status = "Father";
    }
}

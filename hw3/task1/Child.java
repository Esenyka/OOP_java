package hw3.task1;

public class Child extends FamilyPerson{
    protected String status;

    public Child(String surname, String name, String gender, int age){
        super(surname, name, gender, age);
    }

    public String getInfo() {
        String g = super.gender;
        g = g.toLowerCase();
        if (g.equals("female")){
            this.status = "Daughter";
            return String.format("Info:%s  Status: %s",super.getInfo(), this.status);
        }
        this.status = "Son";
        return String.format("Info:%s  Status: %s",super.getInfo(), this.status);
    }
    public String GetPersonStatus(){
        String g = super.gender;
        g = g.toLowerCase();
        if (g.equals("female")){
            return this.status = "Daughter";
        }
        return this.status = "Son";
    }
}

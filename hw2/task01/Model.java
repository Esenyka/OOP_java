package hw2.task01;

public class Model{

    public String isRelative(FamilyPerson p, FamilyPerson p1){
        String s = p.surname;
        if (s.equals(p1.surname)){
            return String.format("Person: %s %s is relative Person: %s %s",
                    p.surname, p.name, p1.surname, p1.name);
        }
        return String.format("Person: %s %s is not relative Person: %s %s",
                p.surname, p.name, p1.surname, p1.name);
    }

    public String getStatus(FamilyPerson p) {
        return p.SetPersonStatus();
    }

    public String getInfo(FamilyPerson p) {
        return String.format("Name -  %s age - %d surname - %s status - %s ",
                p.name, p.age, p.surname, p.SetPersonStatus());
    }


}

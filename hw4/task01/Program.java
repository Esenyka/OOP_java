package hw4.task01;

public class Program {
    public static void main(String[] args) {
        Team<Archer> archers = new Team<>();
        Team<Knight> knights = new Team<>();

        Archer a1 = new Archer("Robin", 100, new Bow(20), new IronSword(4));
        Archer a2 = new Archer("Good", 100, new Bow(15), new IronSword(3));
        Knight k1 = new Knight("Kon", 150, new Knife());
        Knight k2 = new Knight("Bon", 150, new Knife());



        archers.addPerson(a1)
                .addPerson(a2);
        knights.addPerson(k1)
                .addPerson(k2);



        Battle fight = new Battle(a1, a2);
        fight.run();
    }
}

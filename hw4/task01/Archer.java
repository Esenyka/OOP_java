package hw4.task01;

public class Archer extends Warrior<Throwing>{

    public Archer(String n, int hp, Throwing w, IronSword is) {
        super(n, hp, w);
    }

    public int getRange(){
        return rand.nextInt(weapon.range+1);
    }

    @Override
    public String toString() {
        return "Archer{" +
                super.toString() +
                '}';
    }
}

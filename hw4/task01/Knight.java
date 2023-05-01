package hw4.task01;

public class Knight extends Warrior<Knife> {

    public Knight(String n, int hp, Knife w) {
        super(n, hp, w);
    }

    @Override
    public String toString() {
        return "Knight{" + super.toString() +
                "}";
    }

}

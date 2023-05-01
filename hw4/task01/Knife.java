package hw4.task01;

public class Knife implements Weapon {
    @Override
    public int damage() {
        return 20;
    }

    @Override
    public int protect() {
        return 0;
    }

    @Override
    public String toString() {
        return "Knife{" + "damage= " + damage() +
                "}";
    }
}

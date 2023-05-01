package hw4.task01;

public class WoodenSword extends Protection{

    protected String name;
    public WoodenSword(int strength) {
        super(strength);
        this.name = "WoodenSword";
    }

    @Override
    public int damage() {
        return 0;
    }

    @Override
    public int protect() {
        return 10;
    }

    @Override
    public String toString() {
        return "WoodenSword{" +
                "name='" + name + '\'' + super.toString() +
                '}';
    }
}


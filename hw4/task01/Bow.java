package hw4.task01;

public class Bow extends Throwing {
    protected String name;

    public Bow(int range) {
        super(range);
        this.name = "Bow";
    }

    @Override
    public int damage() {
        return 10;
    }

    @Override
    public int protect() {
        return 0;
    }


    @Override
    public String toString() {
        return "Bow{" +
                "name='" + name + super.toString() +
                '}';
    }
}

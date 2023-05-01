package hw4.task01;

public class IronSword extends Protection{
    protected String name;
    public IronSword(int strength) {
        super(strength);
        this.name = "IronSword";
    }

    @Override
    public int damage() {
        return 0;
    }

    @Override
    public int protect() {
        return 20;
    }

    @Override
    public String toString() {
        return "IronSword{" +
                "name='" + name + '\'' + super.toString() +
                '}';
    }
}

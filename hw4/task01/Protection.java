package hw4.task01;

public abstract class Protection implements Weapon{
    protected int strength;
    // Прочность - сколько ударов держится инструмент(в нашем случае щит)

    public Protection(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "Protection{" +
                "strength=" + strength +
                '}';
    }
}

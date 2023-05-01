package hw4.task01;

import java.util.Random;

public class Warrior<T extends Weapon> extends Person{
    protected T weapon;
    protected Weapon ws = new WoodenSword(2);

    protected Weapon is = new WoodenSword(4);
    protected static Random rand = new Random();
    public Warrior(String n, int hp, T w) {
        super(n, hp);
        this.weapon = w;
    }
    public int harm(){
        boolean isHit = rand.nextBoolean();
        int demage = 0;
        if (isHit){
            demage = rand.nextInt(weapon.damage()+1);
        }
        return demage;
    }

    public int defendWood(){
        boolean isDef = rand.nextBoolean();
        int def = 0;
        if (isDef){
            def = rand.nextInt(ws.protect()+1);
        }
        return def;
    }

    public int defendIron(){
        boolean isDef = rand.nextBoolean();
        int def = 0;
        if (isDef){
            def = rand.nextInt(is.protect()+1);
        }
        return def;
    }

    @Override
    public String toString() {
        return "Warrior{" + "name= " + getName() +
                "weapon= " + weapon + "hp= " + getHp() +
                '}';
    }
}

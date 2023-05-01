package hw4.task01;

public abstract class Throwing implements Weapon {
    protected int range;

    protected Throwing(int range){
        this.range = range;
    }

    public int getRange(){
        return range;
    }

    @Override
    public String toString() {
        return "Throwing{" +
                "range= " + range + "damage= " + damage() +
                '}';
    }


}

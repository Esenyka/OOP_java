package hw4.task01;

public abstract class Person {
    protected String name;
    private int healthPoint;

    public Person(String n, int hp){
        this.name = n;
        this.healthPoint = hp;
    }

    public String getName(){
        return name;
    }

    public int getHp(){
        return healthPoint;
    }

    public boolean isAlive(){
        return healthPoint > 0;
    }

    public void reduseHP(int damage){
        healthPoint -= damage;
        if(healthPoint < 0){
            healthPoint = 0;
        }
    }

    }


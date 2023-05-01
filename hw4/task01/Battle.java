package hw4.task01;

public class Battle {
    private Warrior attacker;
    private Warrior defender;

    public Battle(Warrior attacker, Warrior defender) {
        this.attacker = attacker;
        this.defender = defender;
    }

    public Warrior run() {
        while (true) {
            int attacke = attacker.harm();
            int prot = defender.defendWood();
            int res = attacke - prot;
            defender.reduseHP(res);
            System.out.printf("*Warrior %s give harm %d\n Warrior %s hp=%d, protection=%d*\n", attacker.getName(), res,
                    defender.getName(), defender.getHp(), prot);
            if (!defender.isAlive()) {
                System.out.printf("Warrior %s is dead\n The winner is attackers %s\n", defender.getName(),
                        attacker.getName());
                return attacker;
            } else {
                attacke = defender.harm();
                prot = attacker.defendIron();
                res = attacke - prot;
                attacker.reduseHP(attacke);
                System.out.printf("$Warrior %s return harm %d\n Warrior %s hp=%d, protection=%d$\n", defender.getName(), res,
                        attacker.getName(), attacker.getHp(), prot);
                if (!attacker.isAlive()) {
                    System.out.printf("Warrior %s is dead\n The winner is attackers %s\n", attacker.getName(),
                            defender.getName());
                    return defender;
                }
            }
        }
    }
}

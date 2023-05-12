package hw5.task01;

public class CalculateRational extends RationalNumbers implements Calc<RationalNumbers>{

    public CalculateRational(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public RationalNumbers sum() {
        return new RationalNumbers(num1 + num2, 0);
    }

    @Override
    public RationalNumbers difference() {
        return new RationalNumbers(num1 - num2, 0);
    }

    @Override
    public RationalNumbers divide() {
        return new RationalNumbers(num1 / num2, 0);
    }

    @Override
    public RationalNumbers times() {
        return new RationalNumbers(num1 * num2, 0);
    }
}

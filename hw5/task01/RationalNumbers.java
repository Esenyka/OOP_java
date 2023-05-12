package hw5.task01;

public class RationalNumbers extends ValuesNumber {
    public RationalNumbers(double num1, double num2) {
        super.num1 = num1;
        super.num2 = num2;
    }

    @Override
    public String toString() {
        return "RationalNumbers{" +
                "num1=" + num1 +
                '}';
    }
}

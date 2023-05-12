package hw5.task01;

public class ComplexNumbers extends ValuesNumber{
    public ComplexNumbers(double num1, double num2){
        super.num1 = num1;
        super.num2 = num2;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }
        ComplexNumbers cn = (ComplexNumbers) obj;
        return (super.num1 == cn.getNum1()) || (super.num2 == cn.getNum2());
    }

    @Override
    public String toString() {
        return "ComptexNumbers{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }
}

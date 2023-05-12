package hw5.task01;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CalculateComplex extends ComplexNumbers implements Calc<ComplexNumbers>{
    public CalculateComplex(ValuesNumber c) {
        super(c.num1, c.num2);
    }

    @Override
    public ComplexNumbers sum() {
        return new ComplexNumbers((num1 + mNum1), (num2 + mNum2));
    }

    @Override
    public ComplexNumbers difference() {
        return new ComplexNumbers((num1 - mNum1), (num2 - mNum2));
    }

    @Override
    public ComplexNumbers divide() {
        return new ComplexNumbers((((num1 * num2) + (mNum1 * mNum2)) / ((Math.pow(num2, 2)) + (Math.pow(mNum2, 2)))),
                ((mNum1 * num2) - (num1 * mNum2)) / ((Math.pow(num2, 2) + Math.pow(mNum2, 2))));
    }

    @Override
    public ComplexNumbers times() {
        return new ComplexNumbers(((num1 * num2) - (mNum1 * mNum2)), ((num1 * mNum2) + (num2 * mNum1)));
    }

}

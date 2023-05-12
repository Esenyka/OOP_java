package hw5.task01;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class V {
    Scanner in = new Scanner(System.in);
    public void calcComplex() {
        try (FileWriter writer = new FileWriter("notes3.txt", false)) {
            writer.write("LAST OPERATION\n");
            System.out.println("Calculate Complex");
            System.out.print("Input a number 1: ");
            double num1 = in.nextDouble();
            writer.write("num1 = " + num1 + "\n");
            System.out.print("Input a number 2: ");
            double num2 = in.nextDouble();
            writer.write("num2 = " + num2 + "\n");
            CalculateComplex c = new CalculateComplex(new ComplexNumbers(num1, num2));
            System.out.print("Input a m. number 1: ");
            double mNum1 = in.nextDouble();
            writer.write("Input a m. number 1:" + mNum1 + "\n");
            System.out.print("Input a m. number 2: ");
            double mNum2 = in.nextDouble();
            writer.write("Input a m. number 2:" + mNum2 + "\n");
            c.setmNum1(mNum1);
            c.setmNum2(mNum2);

            System.out.println("sum = " + c.sum());
            writer.write("sum = " + c.sum() + "\n");
            System.out.println("difference = " + c.difference());
            writer.write("difference = " + c.difference() + "\n");
            System.out.println("times = " + c.times());
            writer.write("times = " + c.times() + "\n");
            System.out.println("divide = " + c.divide());
            writer.write("divide = " + c.divide() + "\n");
            System.out.println(" ");
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public void calcRetional(){
        try (FileWriter writer = new FileWriter("notes3.txt", false)) {
            writer.write("LAST OPERATION\n");
            System.out.println("Calculate Relation");
            System.out.print("Input a number 1: ");
            double n1 = in.nextDouble();
            writer.write("num1 = " + n1 + "\n");
            System.out.print("Input a number 2: ");
            double n2 = in.nextDouble();
            writer.write("num1 = " + n2 + "\n");
            CalculateRational r = new CalculateRational(n1, n2);
            System.out.println("sum = " + r.sum());
            writer.write("sum = " + r.sum() + "\n");
            System.out.println("difference = " + r.difference());
            writer.write("difference = " + r.difference() + "\n");
            System.out.println("times = " + r.times());
            writer.write("times = " + r.times() + "\n");
            System.out.println("divide = " + r.divide());
            writer.write("divide = " + r.divide() + "\n");
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }


}

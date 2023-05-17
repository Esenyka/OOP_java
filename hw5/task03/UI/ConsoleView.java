package UI;

import Core.MVP.View;

import java.util.Scanner;

public class ConsoleView implements View {
    Scanner in;
    public ConsoleView() {
        in = new Scanner(System.in);
    }
    @Override
    public String getFirstName() {
        System.out.print("FirstName: ");
        return in.nextLine();
    }

    @Override
    public void setFirstName(String value) {
        System.out.printf("FirstName: %s\n", value);
    }

    @Override
    public String getLastName() {
        System.out.print("LastName: ");
        return in.nextLine();
    }

    @Override
    public void setLastName(String value) {
        System.out.printf("LastName: %s\n", value);
    }

    @Override
    public String getAge() {
        System.out.print("Age: ");
        return in.nextLine();
    }

    @Override
    public void setAge(String value) {
        System.out.printf("Age: %s\n", value);
    }

    @Override
    public int getNumber() {
        System.out.print("Class: ");
        return Integer.parseInt(in.nextLine());
    }

    @Override
    public Integer setNumber(Integer value) {
        System.out.printf("Class: %s\n", value);
        return value;
    }
}

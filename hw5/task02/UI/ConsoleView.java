package hw5.task02.UI;
import java.util.Scanner;

import  hw5.task02.Core.MVP.View;

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
    public String getDescription() {
        System.out.print("Description: ");
        return in.nextLine();
    }

    @Override
    public void setDescription(String value) {
        System.out.printf("Description: %s\n", value);
    }

    @Override
    public String getPhone() {
        System.out.print("Phone: ");
        return in.nextLine();
    }

    @Override
    public void setPhone(String value) {
        System.out.printf("Phone: %s\n", value);
    }

    @Override
    public String getEmail() {
        System.out.print("Email (example - rarute@gmail.com): ");
        return in.nextLine();
    }

    @Override
    public void setEmail(String value) {
        System.out.printf("Email: %s\n", value);
    }

    @Override
    public void setAll(String n, String l, String d, String p, String e){
        System.out.printf("Info about %s %s", n, l + " " + d + " " + p + " " + e + "\n");
    }

}

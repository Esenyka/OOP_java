package UI;

import Core.MVP.Presenter;
import Core.MVP.View;

import java.util.Scanner;
public class App {
    public static void Button() {
        System.out.print("\033[H\033[J");
        View view = new ConsoleView();
        Presenter presenter = new Presenter(view, Config.path);
        presenter.LoadFromFile();

        System.out.println("get current class you will work");
        presenter.saveClass();
        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                System.out.println("1 - prev, 2 - next, 3 - add, 4 - get current class");
                String way = in.next();
                System.out.print("\033[H\033[J");
                presenter.save();
                switch (way) {
                    case "1":
                        presenter.prev();
                        break;
                    case "2":
                        presenter.next();
                        break;
                    case "3":
                        presenter.add();
                        break;
                    case "4":
                        presenter.getCurrentClass();
                        break;
                    default:
                        System.out.println("Такой команды нет");
                        break;
                }
            }

    }
    }
}

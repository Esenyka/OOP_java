package hw5.task02.UI;

import java.util.Scanner;

import hw5.task02.Config;
import hw5.task02.Core.MVP.Presenter;
import hw5.task02.Core.MVP.View;


public class App {
    public static void ButtonClick() {
        System.out.print("\033[H\033[J");// ru.stackoverflow.com/questions/1315049/Как-очистить-консоль-в-java-во-время-действия-программы
        View view = new ConsoleView();
        Presenter presenter = new Presenter(view, Config.path);
        presenter.LoadFromFile();

        try (Scanner in = new Scanner(System.in)) {
                System.out.println("Do you want to save contacts one line or five lines?" +
                        " 1 - save one line  2 - save five lines");
                String way = in.next();
                System.out.print("\033[H\033[J");
                if (way.equals("1")) {
                    while (true) {
                        System.out.println(" 1 - prev  2 - next 3 - add 4 - remove");
                        String key = in.next();
                        System.out.print("\033[H\033[J");
                        presenter.saveToFileOne();
                        switch (key) {
                            case "1":
                                presenter.prevOne();
                                break;
                            case "2":
                                presenter.nextOne();
                                break;
                            case "3":
                                presenter.add();
                                break;
                            case "4":
                                presenter.remove();
                                break;
                            default:
                                System.out.println("Такой команды нет");
                                break;
                            }
                    }
                }
                else {
                    while (true) {
                        System.out.println(" 1 - prev  2 - next 3 - add 4 - remove");
                        String key01 = in.next();
                        System.out.print("\033[H\033[J");
                        presenter.saveToFileFive();
                        switch (key01) {
                            case "1":
                                presenter.prevFive();
                                break;
                            case "2":
                                presenter.nextFive();
                                break;
                            case "3":
                                presenter.add();
                                break;
                            case "4":
                                presenter.remove();
                                presenter.saveToFileFive();
                                break;
                            default:
                                System.out.println("Такой команды нет");
                                break;
                        }
                    }
                    }
        }

    }
}

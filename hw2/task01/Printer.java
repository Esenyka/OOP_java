package hw2.task01;

public interface Printer {
    default void print(String s) {
        System.out.println(s);
    }
}

package hw3.task1;

public interface Printer {
    default void print(String s) {
        System.out.println(s);
    }
}

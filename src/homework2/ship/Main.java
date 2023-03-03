package homework2.ship;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Ship1> ships = Arrays.asList(
                new Ship1("Scandinavian Sky", "white", "diesel", 51),
                new Ship1("Thor", "brown", "muscel", 2500),
                new Ship1("Queen Mary 2", "blue", "diesel-electric", 18),
                new Ship1("Royal Princess", "orange", "gas turbine", 8),
                new Ship1("Oasis of the Seas", "orange", "diesel-electric", 13)
        );
        System.out.println("Ships sorted by name:");
        ships.stream()
                .sorted((s1, s2) -> s1.getName().compareTo(s2.getName()))
                .forEach(s -> System.out.println(s.getName()));


        System.out.println("\nOrange ships:");
        ships.stream()
                .filter(s -> s.getColor().equals("orange"))
                .forEach(s -> System.out.println(s.getName()));


        System.out.println("\nAll ship names:");
        ships.stream()
                .map(Ship1::getName)
                .forEach(System.out::println);    }
}

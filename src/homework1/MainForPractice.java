package homework1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainForPractice {
    public static void main(String[] args) {
//        Using streams, for a given lists:
//        - [„John", „Sarah", „Mark", „Tyla", „Ellisha", „Eamonn"]
//        - [1, 4, 2346, 123, 76, 11, 0, 0, 62, 23, 50]
//        a) Sort the list.
//                b) Print only those names, that start with E letter.
//                c) Print values greater than 30 and lower than 200.
//        d) Print names uppercase.
//                e) Remove first and last letter, sort and print names.
//                f) *Sort backwards by implementing reverse Comparator and using lambda
//        expression.
        List<String> names = List.of("John", "Sarah", "Mark", "Tyla", "Ellisha", "Eamonn");
        List<Integer> numbers = List.of(1, 4, 2346, 123, 76, 11, 0, 0, 62, 23, 50);

        List<String> collect = names.stream()
                .sorted()
                .collect(Collectors.toList());//sorted names list
//        System.out.println(collect);
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());//sorted number list
//        System.out.println(sortedNumbers);

        System.out.println("Names starting with E");
        names.stream()
                .filter(str -> str.startsWith("E"))
                .forEach(str -> System.out.print(str + " "));
        System.out.println();

//        Predicate<Integer> p = number -> number > 30;
//        numbers.stream().filter(number -> number >= 30)
//                .filter(number -> number <= 200)
//                .forEach(x -> System.out.println(x));

//                c) Print values greater than 30 and lower than 200.
        numbers.stream()
                .filter(number -> number > 30 && number <= 200)
                .forEach(System.out::println);

//        names.stream().forEach(str -> {
//            System.out.print(str.toUpperCase() + " " + "\n");
//        });
//      Testing code. How to get even numbers.
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers1.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        evenNumbers.forEach(System.out::print);

        List<String> sortUppercase = names.stream()
                .sorted()
                .collect(Collectors.toList());

//        String input = "aBcDeFGHijklMNOP";
//        List<String> sortedUppercase = names.stream()
//                .filter()
//                .sorted()
//                .collect()
//                .toString();
//        System.out.println(sortedUppercase); // prints "BDEFGHMNOP"

//        List<String> upper = names.stream()
//                .filter(name -> name.matches("[A-Z]+"))
//                .sorted()
//                .collect(Collectors.toList());
//        System.out.println(upper);

        List<String> names1 = Arrays.asList("J", "John", "Mary", "JANE", "ROBERT");

        names1.stream()
                .filter(name -> name.matches("[A-Z]+"))
                .map(String::toUpperCase)
                .forEach(System.out::println);


        // d) Print names uppercase.


        String longString = String.join("", names);
        String uppercase = "";
        for (int i = 0; i < longString.length(); i++) {
            char c = longString.charAt(i);
            if (Character.isUpperCase(c)) {
                uppercase += c;
            }
        }
        System.out.println("The uppercase letters are: " + uppercase);
        //        System.out.println(longString);

//           e) Remove first and last letter, sort and print names.

        System.out.println("No first and last letter, sorted");
        names.stream()
                .map(str -> (str.substring(1,str.length()-1)))
                .sorted()
                .collect(Collectors.toList())
                .forEach(str -> System.out.print(str + " "));
        System.out.println();

//                f) *Sort backwards by implementing reverse Comparator and using lambda

        System.out.println("Sorted backwards");
        names.stream()
                .map(str -> (str.substring(1,str.length()-1)))
                .sorted(Comparator.reverseOrder())
                .forEach(str -> System.out.print(str + " "));


//           names.stream().sorted(Comparator.comparing(Comparator.comparing(String::toString)));

//        Given the code above and your knowledge
//        Create an object Ship with fields: name, color, engineType, age
//        Create a stream of 5 instances of the Ship object
//        a) Sort ship by name.
//                b) Print only ships of orange color
//                c) Print all ship names


    }
}

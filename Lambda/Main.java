package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.ArrayList;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class Main {
    public static void main(String[] args) {

        // 1
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> a / b;

        System.out.println("Addition: " + addition.operate(7, 3));
        System.out.println("Subtraction: " + subtraction.operate(7, 3));
        System.out.println("Multiplication: " + multiplication.operate(7, 3));
        System.out.println("Division: " + division.operate(9, 3));

        // 2
        List<Integer> numbers = Arrays.asList(10, 15, 22, 33, 40, 55);
        Predicate<Integer> isOdd = n -> n % 2 != 0;
        List<Integer> oddNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (isOdd.test(number)) {
                oddNumbers.add(number);
            }
        }
        System.out.println("Odd Numbers: " + oddNumbers);

        // 3
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        names.sort((a, b) -> b.compareTo(a));
        System.out.println("Sorted Names: " + names);

        // 4
        Function<String, String> transform = s -> new StringBuilder(s.toUpperCase()).reverse().toString();
        List<String> words = Arrays.asList("hello", "java", "lambda");
        List<String> transformedWords = new ArrayList<>();
        for (String word : words) {
            transformedWords.add(transform.apply(word));
        }
        System.out.println("Transformed Strings: " + transformedWords);

        // 5
        List<String> cities = Arrays.asList("New York", "London", "Tokyo", "Berlin");
        Consumer<String> printCity = city -> System.out.println("City: " + city);
        for (String city : cities) {
            printCity.accept(city);
        }

        // 6
        cities.forEach(System.out::println);

        // 7
        BiFunction<Integer, Integer, Integer> max = (a,b) -> a > b ? a : b;
        BiFunction<Integer, Integer, Integer> min = (a,b) -> a < b ? a : b;
        int a = 25, b = 40;
        System.out.println("Max: " + max.apply(a, b));
        System.out.println("Min: " + min.apply(a, b));

    }
}

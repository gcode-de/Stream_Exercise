import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(10, 21, 33, 14, 55, 36, 79, 18, 9, 10);
        Optional<Integer> result = numbers.stream().filter(number -> number % 2 == 0).peek(System.out::println).map(number -> number * 2).sorted().peek(System.out::println).reduce(Integer::sum);
        result.ifPresent(System.out::println);

        System.out.println("test1");
    }
}

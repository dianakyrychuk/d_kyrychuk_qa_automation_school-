package Lesson9;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int fibNumber = 5;

        int result = Stream.iterate(new int[]{0, 1}, fib -> new int[]{fib[1], fib[0] + fib[1]})
                .limit(fibNumber - 1)
                .reduce((a, b) -> b)
                .map(fib -> fib[1])
                .orElse(0);

        System.out.println(result);
    }
}

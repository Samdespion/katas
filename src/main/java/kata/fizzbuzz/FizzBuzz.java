package kata.fizzbuzz;

public class FizzBuzz {
    public String convert(int number) {
        if (isDivisibleBy3(number) && isDivisibleBy5(number)) return "FizzBuzz";
        else if (isDivisibleBy5(number)) return "Buzz";
        else if (isDivisibleBy3(number)) return "Fizz";
        return "" + number;
    }

    private boolean isDivisibleBy3(int number) {
        return number % 3 == 0;
    }

    private boolean isDivisibleBy5(int number) {
        return number % 5 == 0;
    }
}

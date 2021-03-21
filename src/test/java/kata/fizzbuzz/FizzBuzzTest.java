package kata.fizzbuzz;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void should_return_1_when_input_is_1() {
        // given
        int input = 1;
        String expectedOutput = "1";
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String result = fizzBuzz.convert(input);

        // then
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(result).isNotNull();
        softly.assertThat(result).isEqualTo(expectedOutput);
        softly.assertAll();
    }

    @Test
    public void should_return_2_when_input_is_2() {
        // given
        int input = 2;
        String expectedOutput = "2";
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String result = fizzBuzz.convert(input);

        // then
        Assertions.assertThat(result).isEqualTo(expectedOutput);
    }

    @Test
    public void should_return_fizz_when_input_is_3() {
        // given
        int input = 3;
        String expectedOutput = "Fizz";
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String result = fizzBuzz.convert(input);

        // then
        Assertions.assertThat(result).isEqualTo(expectedOutput);
    }

    @Test
    public void should_return_4_when_input_is_4() {
        // given
        int input = 3;
        String expectedOutput = "Fizz";
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String result = fizzBuzz.convert(input);

        // then
        Assertions.assertThat(result).isEqualTo(expectedOutput);
    }

    @Test
    public void should_return_buzz_when_input_is_5() {
        // given
        int input = 5;
        String expectedOutput = "Buzz";
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String result = fizzBuzz.convert(input);

        // then
        Assertions.assertThat(result).isEqualTo(expectedOutput);
    }

    @Test
    public void should_return_fizz_when_input_is_6() {
        // given
        int input = 6;
        String expectedOutput = "Fizz";
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String result = fizzBuzz.convert(input);

        // then
        Assertions.assertThat(result).isEqualTo(expectedOutput);
    }

    @Test
    public void should_return_buzz_when_input_is_10() {
        // given
        int input = 10;
        String expectedOutput = "Buzz";
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String result = fizzBuzz.convert(input);

        // then
        Assertions.assertThat(result).isEqualTo(expectedOutput);
    }

    @Test
    public void should_return_fizzbuzz_when_input_is_15() {
        // given
        int input = 15;
        String expectedOutput = "FizzBuzz";
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String result = fizzBuzz.convert(input);

        // then
        Assertions.assertThat(result).isEqualTo(expectedOutput);
    }
}

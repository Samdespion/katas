package kata.reverseinparentheses;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

public class ReverseInParenthesesTest {
    /*
     * $ replace ( or ) in methods name
     * example : $bar$ == (bar)
     */

    @Test
    public void should_return_bar_when_input_is_bar() {
        // given
        String input = "bar";
        String expectedOutput = "bar";
        ReverseInParentheses reverseInParentheses = new ReverseInParentheses();

        // when
        String result = reverseInParentheses.compute(input);

        // then
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(result).isNotNull();
        softly.assertThat(result).isEqualTo(expectedOutput);
        softly.assertAll();
    }

    @Test
    public void should_return_rab_when_input_is_$bar$() {
        // given
        String input = "(bar)";
        String expectedOutput = "rab";
        ReverseInParentheses reverseInParentheses = new ReverseInParentheses();

        // when
        String result = reverseInParentheses.compute(input);

        // then
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(result).isNotNull();
        softly.assertThat(result).isEqualTo(expectedOutput);
        softly.assertAll();
    }

    @Test
    public void should_return_foorabfoo_when_input_is_foo$bar$foo() {
        // given
        String input = "foo(bar)foo";
        String expectedOutput = "foorabfoo";
        ReverseInParentheses reverseInParentheses = new ReverseInParentheses();

        // when
        String result = reverseInParentheses.compute(input);

        // then
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(result).isNotNull();
        softly.assertThat(result).isEqualTo(expectedOutput);
        softly.assertAll();
    }

}

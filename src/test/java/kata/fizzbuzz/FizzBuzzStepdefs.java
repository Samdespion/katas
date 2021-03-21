package kata.fizzbuzz;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;

public class FizzBuzzStepdefs {

    private int input;
    private String output;

    @Given("an input of {int}")
    public void an_input_of(int input) {
        this.input = input;
    }

    @When("the input is fizzbuzzed")
    public void the_input_is_fizzbuzzed() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        this.output = fizzBuzz.convert(this.input);
    }

    @Then("^the output is (.*)$")
    public void the_output_is(String expectedOutput) {
        Assertions.assertThat(this.output).isEqualTo(expectedOutput);
    }
}

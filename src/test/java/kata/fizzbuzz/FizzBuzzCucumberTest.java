package kata.fizzbuzz;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = false,
        features = {"classpath:features"},
        glue = {"kata.fizzbuzz"},
        plugin = {"pretty", "html:target/cucumber/fizzbuzz-report.html"}
)
public class FizzBuzzCucumberTest {
}

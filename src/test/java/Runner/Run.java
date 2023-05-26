package Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/W3School.feature"},
        glue = {"StepDefinations"},
        plugin = {"pretty"},
        monochrome = true
)
public class Run{
}

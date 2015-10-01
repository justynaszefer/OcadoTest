import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
//        tags={"@Test2"}
        features = "src/test/features/"
        ,format={"pretty","html:reports/test-report"})
public class RunTest {
}

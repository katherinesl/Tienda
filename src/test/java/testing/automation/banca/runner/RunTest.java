package testing.automation.banca.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src//test//resources//features//automationpractice//",
        glue = {"testing.automation.banca.stepdefinitions", "testing.automation.banca.helpers"},
        tags = "@ESC-01-RegistrarUsuario")



@Test
public class RunTest extends AbstractTestNGCucumberTests {

}

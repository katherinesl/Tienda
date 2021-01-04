package testing.automation.banca.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src//test//resources//features//automationpractice//",
        glue = "testing.automation.banca.stepdefinitions",
        tags = "@ESC-02-LoguearUsuario")



@Test
public class RunTest extends AbstractTestNGCucumberTests {

}
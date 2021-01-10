package testing.automation.banca.stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.HookDefinition;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import testing.automation.banca.helpers.Hook;

import java.util.concurrent.TimeUnit;

public class BuscarVestidos {

    private final WebDriver driver;

    public BuscarVestidos(){
        this.driver = Hook.getDriver();
    }

    @Given("^el usuario desea buscar todos vestido en la pagina automationpractice$")
    public void elUsuarioDeseaBuscarTodosVestidoEnLaPaginaAutomationpractice() {
        driver.findElement(By.className("login")).click();
        driver.findElement(By.id("email")).sendKeys("julissa4@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("987654321");
        driver.findElement(By.className("icon-lock")).click();

    }

    @When("^ingresa el producto vestido$")
    public void ingresaElProductoVestido() {
        driver.findElement(By.id("search_query_top")).sendKeys("Dress");


    }

    @Then("^debe mostrar todos los vestidos con sus precios$")
    public void debeMostrarTodosLosVestidosConSusPrecios() {
        driver.findElement(By.className("button-search")).click();
        System.out.println(driver.findElement(By.className("product_list")).getText());

    }



}

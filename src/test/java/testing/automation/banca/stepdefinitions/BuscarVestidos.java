package testing.automation.banca.stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuscarVestidos {

    @Before
    public static void pagWeb3() {

        System.setProperty(webdriver.chrome.driver,System.getProperty(""))


    }

    @Given("^el usuario desea buscar todos vestido en la pagina automationpractice$")
    public void elUsuarioDeseaBuscarTodosVestidoEnLaPaginaAutomationpractice() {
        System.out.println("holamundo1");
    }

    @When("^ingresa el producto vestido$")
    public void ingresaElProductoVestido() {
        System.out.println("hola mundo2");
    }

    @Then("^debe mostrar todos los vestidos con sus precios$")
    public void debeMostrarTodosLosVestidosConSusPrecios() {
        System.out.println("hola mundo3");

    }

    @After
    public static void cerrarPagina() {

    }

}

package testing.automation.banca.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginUser {

    private WebDriver driver;




    @Given("^el usuario desea logear en la pagina Automationpractice$")
    public void elUsuarioDeseaLogearEnLaPaginaAutomationpractice() throws InterruptedException {

    }

    @When("^envía informacion requerida$")
    public void envíaInformacionRequerida() throws InterruptedException {
        driver.findElement(By.id("email")).sendKeys("julissa4@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("123456789");
        driver.findElement(By.id("SubmitLogin")).click();


    }

    @Then("^debe poder administrar su perfil$")
    public void debePoderAdministrarSuPerfil() throws InterruptedException {

       driver.findElement(By.xpath("//span[text()='My personal information']")).click();
        //CAMBIAR CONTRASEÑA//
        driver.findElement(By.id("old_passwd")).sendKeys("123456789");

        driver.findElement(By.id("passwd")).sendKeys("987654321");
        driver.findElement(By.id("confirmation")).sendKeys("987654321");
        driver.findElement(By.xpath("//span[text()='Save']")).click();
        System.out.println(driver.findElement(By.className("alert-success")).getText());



    }

    /*@After
    public void cerrarPagina (){
        driver.quit();
    }
*/

}

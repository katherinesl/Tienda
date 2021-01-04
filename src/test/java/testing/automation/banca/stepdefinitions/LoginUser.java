package testing.automation.banca.stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginUser {

    public static WebDriver driver;
/*
    @Before
    public static void pagWeb() {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/driver/chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.navigate().to("http://automationpractice.com/");

    }
*/

    @Given("^el usuario desea logear en la pagina Automationpractice$")
    public void elUsuarioDeseaLogearEnLaPaginaAutomationpractice() throws InterruptedException {

        driver.findElement(By.className("login")).click();



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

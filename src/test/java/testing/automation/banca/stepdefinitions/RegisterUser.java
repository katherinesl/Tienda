package testing.automation.banca.stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class RegisterUser {

public static WebDriver driver;

//    @Before
//    public static void abrirPagina(){
//        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/driver/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.navigate().to("http://automationpractice");
//        driver.manage().deleteAllCookies();
//
//        }


    @Given("^el usuario desea registrarse en Automationpractice$")
    public void el_usuario_desea_registrarse_en_Automationpractice() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        driver.findElement(By.className("login")).click();
        Thread.sleep(10000);


    }

    @When("^envia informacion requerida$")
    public void envia_informacion_requerida() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //driver.manage().window();
        driver.findElement(By.id("email_create")).sendKeys("julissa4@gmail.com");
        
        driver.findElement(By.id("SubmitCreate")).click();
        
        driver.findElement(By.id("id_gender1")).click();
        
        driver.findElement(By.id("customer_firstname")).sendKeys("jubilo");
        
        driver.findElement(By.id("customer_lastname")).sendKeys("Hernandez");
        driver.findElement(By.id("email")).click();
        
        driver.findElement(By.id("passwd")).sendKeys("123456789");

        Select selectDay = new Select(driver.findElement(By.id("days")));
        selectDay.selectByValue("12");

        Select selectMonth = new Select(driver.findElement(By.id("months")));
        selectMonth.selectByValue("3");

        Select selectYear = new Select(driver.findElement(By.id("years")));
        selectYear.selectByValue("2000");

        driver.findElement(By.id("newsletter")).click();
        driver.findElement(By.id("optin")).click();
        driver.findElement(By.id("firstname")).sendKeys("jubilo");
        driver.findElement(By.id("lastname")).sendKeys("Hernadez");
        driver.findElement(By.id("company")).sendKeys("Tsoft");
        driver.findElement(By.id("address1")).sendKeys("lima");
        driver.findElement(By.id("city")).sendKeys("Perú");
        driver.findElement(By.id("address2")).sendKeys("Villa el salvador");

        Select selectState = new Select(driver.findElement(By.id("id_state")));
        selectState.selectByValue("3");

        driver.findElement(By.id("postcode")).sendKeys("00000");

        Select selectCountry = new Select(driver.findElement(By.id("id_country")));
        selectCountry.selectByValue("21");

        driver.findElement(By.id("other")).sendKeys("ejemplo01");

        driver.findElement(By.id("phone")).sendKeys("012880001");
        driver.findElement(By.id("phone_mobile")).sendKeys("999999999");
        driver.findElement(By.id("alias")).sendKeys("ejemplo22");




    }

    @Then("^debe poder visualizar sus datos como usuario$")
    public void debe_poder_visualizar_sus_datos_como_usuario() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//span[text()='Register']")).click();
        System.out.println(driver.findElement(By.className("info-account")).getText());
        Thread.sleep(60000);

    }




//     @After
//     public static void cerrarPagina(){
//    driver.quit();
//    }


}

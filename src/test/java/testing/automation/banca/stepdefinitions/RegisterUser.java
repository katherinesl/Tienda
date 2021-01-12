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
import testing.automation.banca.helpers.Hook;
import testing.automation.banca.pageobject.CommonPage;
import testing.automation.banca.pageobject.RegisterUserPage;

import java.util.concurrent.TimeUnit;

public class RegisterUser {

    static WebDriver driver;
    static CommonPage commonPage = new CommonPage(driver);
    static RegisterUserPage registerUserPage= new RegisterUserPage(driver);
    public RegisterUser(){ this.driver = Hook.getDriver(); }

    @Given("^el usuario desea registrarse en Automationpractice$")
    public void el_usuario_desea_registrarse_en_Automationpractice() throws Throwable {
        commonPage.loginClick(driver);
    }

    @When("^envia informacion requerida$")
    public void envia_informacion_requerida() throws Throwable {
        registerUserPage.sendEmail(driver,"julissa12@gmail.com" );
        registerUserPage.createEmailClick(driver);
        registerUserPage.selectionTitleClick(driver);
        registerUserPage.send_firstname(driver,"jubilos");
        registerUserPage.registerLastname(driver,"hernandez");
        registerUserPage.clickEmail(driver);
        registerUserPage.registerPassword(driver,"123456789");
        registerUserPage.selectDay(driver,"12");
        Thread.sleep(1000);

/*
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


*/

    }

    @Then("^debe poder visualizar sus datos como usuario$")
    public void debe_poder_visualizar_sus_datos_como_usuario() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//span[text()='Register']")).click();
        System.out.println(driver.findElement(By.className("info-account")).getText());
        Thread.sleep(60000);

    }


}

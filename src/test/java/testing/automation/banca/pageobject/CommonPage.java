package testing.automation.banca.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonPage {

    static WebDriver driver;

    By COMMON_A_HEF_SIGN_IN = By.className("login");

    //CONSTRUCTOR:
    public CommonPage(WebDriver driver){
        this.driver = driver;
    }

    //metodo para hacer click en login
    public void loginClick(WebDriver driver) {
        driver.findElement(COMMON_A_HEF_SIGN_IN).click();
    }




}

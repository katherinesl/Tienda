package testing.automation.banca.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterUserPage {

    static WebDriver driver;

    By REGISTER_USER_TEXTFIELD_EMAIL = By.id("email_create");
    By REGISTER_USER_BUTTON_CREATE = By.id("SubmitCreate");
    By SELECTION_TITLE= By.id("id_gender1");
    By REGISTER_FIRSTNAME= By.id("customer_firstname");
    By REGISTER_LASTNAME= By.id("customer_lastname");
    By CLICK_EMAIL = By.id("email");
    By REGISTER_CONTRASENA=By.id(("passwd"));
    By SELECT_DAY=By.id("days");

    public RegisterUserPage(WebDriver driver) { this.driver= driver; }

    //METODO PARA INGRESAR CORREO
    public void sendEmail(WebDriver driver, String valor){
        driver.findElement(REGISTER_USER_TEXTFIELD_EMAIL).sendKeys(valor);
    }
    //METODO PARA REGISTRAR EL CORREO
    public void createEmailClick(WebDriver driver){
        driver.findElement(REGISTER_USER_BUTTON_CREATE).click();
    }
    public void selectionTitleClick(WebDriver driver){
        driver.findElement(SELECTION_TITLE).click();
    }

    public void send_firstname(WebDriver driver, String valor){
        driver.findElement(REGISTER_FIRSTNAME).sendKeys(valor);
    }

    public void registerLastname(WebDriver driver,String valor){
        driver.findElement(REGISTER_LASTNAME).sendKeys(valor);


    }

    public void clickEmail(WebDriver driver){
        driver.findElement(CLICK_EMAIL).click();

    }

    public void registerPassword(WebDriver driver,String valor){
        driver.findElement(REGISTER_CONTRASENA).sendKeys(valor);
    }

    public void selectDay(WebDriver driver, String valor){
        Select selectDay = new Select(driver.findElement(SELECT_DAY));
        selectDay.selectByValue(valor);



    }





}





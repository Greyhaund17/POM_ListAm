package WebPageOpeningFunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Login {
    WebDriver driver;
    By myAccountButton = By.id("ma");
    By emailFiled = By.id("_idphone_number_or_email");
    By passwordFiled = By.id("_idpassword");
    By langName = By.xpath("//*[@id=\"dlgLangSel\"]/div[3]/a[3]");
    By confirmationOfLogIn=By.id("action__form_action0");

    public Login(WebDriver driver) {
        this.driver = driver;
    }

    public void language() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(langName).click();
    }

    public void loginButton() {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(myAccountButton).click();
    }

    public void loginFunctional() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(emailFiled).sendKeys("java17@yopmail.com");
        driver.findElement(passwordFiled).sendKeys("Hitman047");
        driver.findElement(confirmationOfLogIn).click();
    }

}

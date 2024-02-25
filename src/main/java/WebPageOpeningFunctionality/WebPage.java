package WebPageOpeningFunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WebPage {
    WebDriver driver;
    By lang = By.xpath("//*[@id=\"dlgLangSel\"]/div[3]/a[3]");
                                     ////*[@id="dlgLangSel"]/div[3]/a[3]   /img
    By logIn = By.id("ma");
    By emailFiled = By.id("_idphone_number_or_email");
    By passwordFiled = By.id("_idpassword");
    By registrationButton = By.xpath("//a[@class='bblink']");
    By emailRadioButton = By.id("irt1r11");
    By yourEmail = By.name("your_email");
    By confirmationEmail = By.id("action__form_action0");

    public WebPage(WebDriver driver) {
        this.driver = driver;
    }

    public void language() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(lang).click();
    }

    public void loginFunction() {
        driver.findElement(logIn).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(emailFiled).sendKeys("java17@yopmail.com");
        driver.findElement(passwordFiled).sendKeys("Beach1234");
        driver.findElement(registrationButton).click();
    }

    public void signUpCarryOn() {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(emailRadioButton).click();
        boolean b = driver.findElement(emailRadioButton).isSelected();
        System.out.println(b);
    }

    public void emailFeelingOption() {
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.findElement(yourEmail).sendKeys("java17@yopmail.com");
        driver.findElement(confirmationEmail).click();
    }
}

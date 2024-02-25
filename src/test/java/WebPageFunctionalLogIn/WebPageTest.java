package WebPageFunctionalLogIn;

import WebPageOpeningFunctionality.Login;
import WebPageOpeningFunctionality.WebPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class WebPageTest {
    WebDriver driver=new ChromeDriver();
    WebPage mainPage=new WebPage(driver);
  //  Login login=new Login(driver);

    @Test
    public void pageOpen() {
        driver.get("https://www.list.am/");
        driver.manage().window().maximize();
    }

    @Test
    public void languageSetUp() throws InterruptedException {
        driver.get("https://www.list.am/");
        mainPage.language();
    }

    @Test
    public void signUp() {
        mainPage.loginFunction();
    }

    @Test
    public void signUpContinuation() {
        mainPage.signUpCarryOn();

    }

    @AfterTest
    public void email(){
        mainPage.emailFeelingOption();
    }
}

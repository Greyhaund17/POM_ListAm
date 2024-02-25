package WebPageFunctionalLogIn;

import WebPageOpeningFunctionality.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver=new ChromeDriver();
    Login login= new Login(driver);


    @Test
    public void browserLoad() {
        driver.navigate().to("https://www.list.am/");
        driver.manage().window().maximize();
    }

    @Test(dependsOnMethods = "browserLoad")
    public void languageSetUp() throws InterruptedException {
        driver.navigate().to("https://www.list.am/");
       login.language();
    }

    @Test(dependsOnMethods = "browserLoad")
    public void accountButton() {
        login.loginButton();
    }

    @Test(dependsOnMethods = "browserLoad")
    public void loginFunctionality() {
        driver.get("https://www.list.am/login");
        login.loginFunctional();
    }
}

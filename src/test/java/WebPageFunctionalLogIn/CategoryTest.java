package WebPageFunctionalLogIn;

import WebPageOpeningFunctionality.Category;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class CategoryTest {
    WebDriver driver = new ChromeDriver();
    Category cars = new Category(driver);

    @Test
    public void browserOpen() {
        driver.get("https://www.list.am");
        driver.manage().window().maximize();
    }

    @Test
    public void language() throws InterruptedException {
        driver.navigate().to("https://www.list.am/");
        cars.language();
    }

    @Test(dependsOnMethods = "browserOpen")
    public void action() throws InterruptedException{
      driver.get("https://www.list.am/");
        cars.hoverOver();
    }

    @AfterTest
    public void menu() throws InterruptedException {
        driver.get("https://www.list.am/");
        cars.apartamentSection();
    }
}


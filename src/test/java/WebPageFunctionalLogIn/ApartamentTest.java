package WebPageFunctionalLogIn;

import WebPageOpeningFunctionality.Apartament;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ApartamentTest {
    WebDriver driver = new ChromeDriver();
    Apartament home = new Apartament(driver);

    @BeforeTest
    public void webPageLoad() {
        driver.get("https://www.list.am/en/category/56");
        driver.manage().window().maximize();
    }

    @Test
    public void locationOfHouse() throws InterruptedException {
        home.dropDown();
    }

    @AfterTest
    public void boom() throws InterruptedException {
        home.allPlaces();
    }

}

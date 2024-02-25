package WebPageOpeningFunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Category {
    WebDriver driver;
    By vehicles = By.xpath("//*[@id=\"menu\"]/span");
    By lang = By.xpath("//*[@id=\"dlgLangSel\"]/div[3]/a[3]");
    By apartamentFiled = By.cssSelector("#menu > div > div > div > span.s > div > div:nth-child(1) > div:nth-child(2) > a:nth-child(1)");
   // By carFiled = By.cssSelector("#menu > div > div > div > span:nth-child(2) > div > div:nth-child(1) > div:nth-child(2) > a:nth-child(1)");

    public Category(WebDriver driver) {
        this.driver = driver;
    }

    public void language() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(lang).click();
    }

    public void hoverOver() throws InterruptedException {
        Thread.sleep(100);
        WebElement dr = driver.findElement(vehicles);
        Actions action = new Actions(driver);
        action.moveToElement(dr).build().perform();
    }

    public void apartamentSection() throws InterruptedException {
        Thread.sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement apartamentElement = wait.until(ExpectedConditions.elementToBeClickable(apartamentFiled));
        apartamentElement.click();
    }
}

package WebPageOpeningFunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Apartament {
    WebDriver driver;
    By locationDropdown = By.xpath("(//div[@class='lsw'])[1]");
    By yerevanLocation = By.xpath("//div[@data-multi='4']/div[@class='i'][1]");
    By allLocations =By.xpath("//div[@data-multi='4']/div");
    public Apartament(WebDriver driver) {
        this.driver = driver;
    }

    public void dropDown() throws InterruptedException {
        driver.findElement(locationDropdown).click();
      //  driver.findElement(yerevanLocation).click();
     //   Thread.sleep(1000);
     //   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
     //   WebElement checkmark = wait.until(ExpectedConditions.elementToBeClickable(yerevanLocation));
     //   checkmark.click();
    }
    public void allPlaces() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust the timeout as needed
        wait.until(ExpectedConditions.presenceOfElementLocated(allLocations));

        List <WebElement> checkBox =  driver.findElements(allLocations);
       if (checkBox.size()<=116){
           System.out.println("It's ok");
       }else {
           System.out.println("Count is not the same");
       }
        for (WebElement checkFiled: checkBox) {
             // checkFiled.click();
            wait.until(ExpectedConditions.elementToBeClickable(checkFiled)).click();
        }
    }
}

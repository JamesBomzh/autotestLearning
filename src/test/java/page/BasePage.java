package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void click (By elementBy) {
        driver.findElement(elementBy).click();
    }

    void clear (By elementBy) {
        driver.findElement(elementBy).clear();
    }

    public void sendKeys (By elementBy, String keys) {
        driver.findElement(elementBy).sendKeys(keys);
    }

    public void isElementDisplayed (By elementBy) {
        assertTrue(driver.findElement(elementBy).isDisplayed());
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }
}

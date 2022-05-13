package test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.LoginPage;

import java.time.Duration;

public class LoginTest extends BaseTest {

    By successLocator = By.className("stack-type-name");

    @Test
    public void loginTest() {
        LoginPage page = new LoginPage(driver);
        String setUrl = "https://wake-up-warrior-staging.web.app/sign-in";
        driver.get(setUrl);
        Assert.assertEquals(page.getUrl(), setUrl);
        page.loginInput("vladimir.istomin@kepler.team");
        page.passwordInput("test123");
        page.singIn();
        WebElement dynamicElement = (new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(successLocator)));
    }
}

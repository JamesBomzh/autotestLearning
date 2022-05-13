package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    By loginLocator = By.xpath("//*[@id=\"app\"]/ion-app/div/div[2]/div/div/div[2]/div[1]/div/ion-input/input");
    By passwordLocator = By.xpath("//*[@id=\"app\"]/ion-app/div/div[2]/div/div/div[2]/div[2]/div/ion-input/input");
    By singInBtn = By.xpath("//*[@id=\"app\"]/ion-app/div/div[2]/div/div/div[5]/ion-button");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginInput(String text) {
        clear(loginLocator);
        click(loginLocator);
        sendKeys(loginLocator, text);
    }

    public void passwordInput(String text) {
        clear(passwordLocator);
        click(passwordLocator);
        sendKeys(passwordLocator, text);
    }

    public void singIn() {
        click(singInBtn);
    }
}

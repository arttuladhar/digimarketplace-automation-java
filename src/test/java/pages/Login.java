package pages;

import env.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by batadjanov on 7/29/2017.
 */
public class Login implements BaseTest {
    private String notification = "[role=alert]";
    private String email = "input[type=email]";
    private String password = "input[type=password]";
    private String submitButton = "button[type=submit]";

    public void navigateToPage() {
        driver.get("http://digimarketplace.aayushtuladhar.com/#/login");
    }

    public boolean isInvalidLoginNotificationDisplayed() {
        WebElement notification = driver.findElement(By.cssSelector(this.notification));
        return notification.isDisplayed();
    }

    public void attemptLogin(String email, String password) {
        WebElement emailField = driver.findElement(By.cssSelector(this.email));
        WebElement passwordField = driver.findElement(By.cssSelector(this.password));
        WebElement submitButton = driver.findElement(By.cssSelector(this.submitButton));

        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        submitButton.click();
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by batadjanov on 7/29/2017.
 */
public class Login {
    WebDriver driver = null;

    private String notification = "[role=alert]";

    public boolean isFailedLoginNotificationDisplayed() {
        WebElement notification = driver.findElement(By.cssSelector(this.notification));
        notification.click();
        System.out.println("tests");
        return true;
    }
}

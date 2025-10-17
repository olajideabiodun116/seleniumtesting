import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class waitDemo {
    public static void main(String[] args) {
        // Launch Chrome
        WebDriver driver = new ChromeDriver();

        // open sauceDemo page
        driver.get("https://saucedemo.com");

        // login first
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // Explicit wait for page
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));

    }
}
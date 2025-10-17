import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class facebookNow {
    public static void main(String[] args) {
        // create a new instance for ChromeDriver
        WebDriver driver = new ChromeDriver();

        // open the site
        driver.get("https://www.facebook.com/");

        // locate login and interact
        WebElement EmailField = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        WebElement PasswordField = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
        WebElement LoginBotton = driver.findElement(By.id("login"));

        // Enter username and password
        EmailField.sendKeys("Neverlandolajide@gmail.com");
        PasswordField.sendKeys("Neverlander116");
        LoginBotton.click();

    }
}

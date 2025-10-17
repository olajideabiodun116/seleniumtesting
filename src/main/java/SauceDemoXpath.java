import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoXpath {
    public static void main(String[] args) {
        // 1. Set up ChromeDriver (WebDriverManager can be used in real projects)
        WebDriver driver = new ChromeDriver();

        // 2. Open Sauce Demo website
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));


        loginButton.click();


    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sportybet {
    public static void main(String[] args) {
        // 1. Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // 2. Navigate to the login page
        driver.get("https://sportybet.com");

        // 3. Locate the username input field by its name attribute
        WebElement usernameField = driver.findElement(By.name("phone"));

        // 4. Locate the password input field by its name attribute
        WebElement passwordField = driver.findElement(By.name("psd"));

        // 5. Locate the login button by its name attribute
        WebElement loginButton = driver.findElement(By.name("logIn"));

        // 6. Enter the username
        usernameField.sendKeys("7066963039");

        // 7. Enter the password
        passwordField.sendKeys("4TI7ven@me");

        // 8. Click the login button
        loginButton.click();

        // 9. Verify that the login was successful by checking the presence of a specific element
        WebElement dashboardElement = driver.findElement(By.id("dashboard"));
        if (dashboardElement.isDisplayed()) {
            System.out.println("Login Test Passed ✅");
        } else {
            System.out.println("Login Test Failed ❌");
        }

        // 10. Close the browser
        driver.quit();
    }
}
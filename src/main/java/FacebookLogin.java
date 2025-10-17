import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class FacebookLogin {
    public static void main(String[] args) {

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Step 1: Open Facebook Login Page
        driver.get("https://www.facebook.com/");

        // Step 2: Enter wrong email and password
        WebElement emailField = driver.findElement(By.xpath("//input[@id='email']"));
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='pass']"));

        emailField.sendKeys("Neverland@gmail.com");
        passwordField.sendKeys("Neverland116");

        // Step 3: Click the Login button
        WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
        loginButton.click();

        // Step 4: Print the error message
        WebElement ErrorMessage = driver.findElement(By.className("_9ay7"));
        System.out.println("Error Message: " + ErrorMessage.getText());




    }
}
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class SauceDemoByTagName {
    public static void main(String[] args) {
        // 1. Set up ChromeDriver
        WebDriver driver = new ChromeDriver();

        // 2. Open Sauce Demo website
        driver.get("https://www.saucedemo.com/");

        // 3. Find all input fields
        List<WebElement> inputFields = driver.findElements(By.tagName("input"));
        System.out.println("Number of input fields: " + inputFields.size());

        // 4. Find all button elements
        List<WebElement> buttons = driver.findElements(By.tagName("button"));

        // 5. Print the text of each button
        for (WebElement button : buttons) {
            System.out.println("Button text: " + button.getText());
        }

        // Optional: close browser

    }
}

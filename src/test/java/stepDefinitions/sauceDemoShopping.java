package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class sauceDemoShopping {
    WebDriver driver;
    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.get("https://www.saucedemo.com/");
    }
    @And("user enters username and password")
    public void userEntersUsernameAndPassword() {
        driver.findElement(By.id("user-name")).sendKeys("visual_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }
    @And("User click the login button")
    public void userClickLoginButton() {
        driver.findElement(By.id("login-button")).click();
    }
    @Then("user should see products page")
    public void userShouldSeeProductsPage() {
        boolean isProductsDisplayed = driver.findElement(By.className("title")).isDisplayed();
        assert isProductsDisplayed;
    }
    @And("user should click sauce labs backpack")
    public void userShouldClickSauceLabsBackpack() {
        driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).click();
    }
    @And("user clicks add to cart")
    public void userClicksAddToCart() {
        driver.findElement(By.xpath("//*[@id=\"add-to-cart\"]")).click();
    }
    @Then("user proceed to the cart icon")
    public void userProceedToTheCartIcon() {
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).click();
    }
    @And("user navigate to checkout")
    public void userNavigateToCheckout() {
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
    }
    @And("user should fill up the information")
    public void userShouldFillUpTheInformation() {
        driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Neverland");
        driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("olajide");
        driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("10001");
    }
    @Then("user clicks on continue")
    public void userClicksOnContinue() {
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
    }
    @And("user clicks on finish")
    public void userClicksOnFinish() {
        driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
    }
    @Then("user should see a success message")
    public void userShouldSeeASuccessMessage() {
        boolean isSuccessMessageDisplayed = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2")).isDisplayed();
        assert isSuccessMessageDisplayed;

    }




}

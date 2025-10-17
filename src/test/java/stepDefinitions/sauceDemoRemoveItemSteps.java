package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class sauceDemoRemoveItemSteps {
    WebDriver driver;
    @Given("user is on the home page")
    public void userIsOnTheHomePage() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.get("https://www.saucedemo.com/");
    }
    @When("user enters username")
    public void userEntersUsername()  {
        driver.findElement(By.id("user-name")).sendKeys("visual_user");

    }

    @And("user enters password")
    public void user_enters_password() {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @And("user click the login button to proceed")
    public void user_click_login_to_proceed_button() {
        driver.findElement(By.name("login-button")).click();
    }
    @Then("user should see inventory page")
    public void user_shouldSee_inventory_page() {
        boolean isProductsDisplayed = driver.findElement(By.className("title")).isDisplayed();
        assert isProductsDisplayed;
    }
    @And("user should navigate to sorts icon")
    public void userShouldNavigateToSortsIcon() {
        driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
    }
    @And("user clicks low to high")
    public void userClicksLowToHigh() {
        Select sortDropdown = new Select(driver.findElement(By.cssSelector("[data-test='product-sort-container']")));
        sortDropdown.selectByVisibleText("Price (low to high)");
    }
    @And("user adds sauce labs bike light")
    public void userAddsSauceLabsBikeLight() {
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
    }
    @And("user adds sauce labs fleece jacket to the shopping cart")
    public void userAddsSauceLabsFleeceJacketToTheShoppingCart() {
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click();
    }
    @And("user removes sauce labs fleece jacket from the cart")
    public void userRemovesSauceLabsFleeceJacketFromTheCart() {
        driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-fleece-jacket\"]")).click();
    }
    @And("user navigate to the menu bar")
    public void userNavigateToTheMenuBar() {
        driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
    }
    @And("user clicks on all items")
    public void userClicksOnAllItems() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(By.id("inventory_sidebar_link"))).click();
    }
    @And("user navigates to the shopping cart")
    public void userNavigatesToTheShoppingCart() {
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).click();
    }
    @And("user proceeds to checkout")
    public void userProceedsToCheckout() {
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
    }
    @And("user enters checkout valid information")
    public void userShouldFillUpTheInformation() {
        driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Neverland");
        driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("olajide");
        driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("10001");
    }
    @Then("user click on continue")
    public void userClickOnContinue() {
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
    }
    @And("user verify tax is $0.80")
    public void userVerifyTaxIs_$0_80() {
        String finalTax = driver.findElement(By.className("summary_tax_label")).getText();
        Assert.assertEquals("Tax: $0.80", finalTax);
        System.out.println("Tax Displayed and Correct: " + finalTax);
    }
    @And("user clicks finish to complete the order")
    public void userClicksFinishToCompleteTheOrder() {
        driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
    }
    @Then("user should see a confirmation message")
    public void userShouldSeeAConfirmationMessage() {
        boolean isSuccessMessageDisplayed = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2")).isDisplayed();
        assert isSuccessMessageDisplayed;

    }



}

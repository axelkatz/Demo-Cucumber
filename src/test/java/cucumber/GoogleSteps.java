package cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSteps {

    private static final Logger logger = LogManager.getLogger();
    private final WebDriver driver = new FirefoxDriver();

    @Given("I open a browser to Google home page")
    public void iOpenABrowserToGoogleHomePage() {
        logger.info("Ouverture de la page Google.");
        driver.get("https://www.google.fr");
    }

    @When("I decline sharing my information")
    public void iDeclineSharingMyInformation() {
        logger.info("On refuse d'être pistés.");
        driver.findElement(By.xpath("//div[.='Tout refuser']/..")).click();
    }

    @Then("The Google logo is displayed")
    public void theGoogleLogoIsDisplayed() {
        logger.info("On vérifie que le le logo Google est bien présent.");
        boolean isDisplayed = driver.findElement(By.id("hplogo")).isDisplayed();
        Assert.assertTrue(isDisplayed);
        logger.info("Fermetures des navigateurs.");
        driver.close();
    }
}

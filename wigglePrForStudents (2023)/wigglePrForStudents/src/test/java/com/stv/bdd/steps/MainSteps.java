package com.stv.bdd.steps;

import com.stv.design.designpages.MainPage;
import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.factory.factorytests.BasicFactoryTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static com.stv.framework.core.lib.WigglePageURLs.START_URL;

public class MainSteps extends BasicFactoryTest {
    MainPage mainPage = new MainPage();
    MainFactoryPage mainFactoryPage = new MainFactoryPage();

    @When("Home page is opened")
    public void homePageIsOpened() {
        WebDriver driver = getDriver();
        driver.get(START_URL);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Then("Wiggle Logo is displayed")
    public void wiggleLogoIsDisplayed() {
        mainPage.isMainLogoDisplayed();
    }

    @And("Account Link is displayed")
    public void accountLinkIsDisplayed() {
        mainFactoryPage.isAccountLinkDisplayed();
    }

    @And("User clicks on the language switcher")
    public void userClicksTheLanguageSwitcher() {
        mainFactoryPage.clickOnLanguageSwitcher();
    }

    @And("User selects region Europa")
    public void userSelectsSuggestedRegionTile() {
        mainFactoryPage.selectRegionEuropa();
    }

    @And("User clicks on {string} button")
    public void userClicksOnButton(String arg0) {
        mainFactoryPage.clickOnTrustButton();
    }

    @And("User selects Andorra English")
    public void userSelectsAndorraEnglish() {
        mainFactoryPage.selectLanguageAndorra_EN();
    }

    @Then("Language is updated to EN EUR")
    public void languageIsUpdatedToAbbreviation() {
        mainFactoryPage.languageIsUpdatedTo_EN_EUR();
    }
    @And("User clicks on Cancel button in pop-up")
    public void userClicksOnCancelButtonInPopUp() {
        mainFactoryPage.clickOnCancelButton();
    }

    @And("User clicks on Blog link")
    public void userClicksOnBlogLink() {
        mainFactoryPage.clickBlog();
    }

    @Then("Blog image is displayed")
    public void blockPageIsDisplayed() {
        mainFactoryPage.blogImageIsVisible();
    }

    @And("User clicks on logo")
    public void userClicksOnLogo() {
        mainFactoryPage.clickLogo();
    }

    @Then("Home image is displayed")
    public void homeImageIsDisplayed() {
        mainFactoryPage.homeImageIsVisible();
    }

    @And("User clicks on Help link")
    public void userClicksOnHelpLink() {
        mainFactoryPage.clickHelpLinkInHeader();
    }

    @Then("Help page is displayed")
    public void helpPageIsDisplayed() {
        mainFactoryPage.CustomerServiceTextIsDisplayed();
    }

    @And("User selects {string}")
    public void userSelectsLanguage(String language) {
        mainFactoryPage.selectSuggestedLanguage(language);
    }

    @Then("{string} is displayed")
    public void abbreviationIsUpdated(String abbr) {
        mainFactoryPage.abbreviationIsDisplayed(abbr);
    }
}



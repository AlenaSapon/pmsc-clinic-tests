package com.stv.factory.factorypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.stv.framework.core.drivers.Driver.driver;

public class MainFactoryPage extends FactoryPage {

    @FindBy(css = "[aria-label='Sign in']")
    private WebElement accountLink;

    @FindBy(xpath = "//button[contains(text(),'Accept all')]")
    private WebElement trustButton;

    @FindBy(xpath = "//button//span[contains(text(),'Cancel')]")
    private WebElement cancelButton;

    @FindBy(xpath = "//button[@id = 'countrySelectorOpener']")
    private WebElement languageSwitcher;

    @FindBy(xpath = "//*[@id='countryListLarge']//a[contains(text(),'Andorra')][@href='https://www.wiggle.com/eu']")
    private WebElement andorra_EN;

    @FindBy(xpath = "//button[contains(text(),'Europe')]")
    private WebElement europa;

    @FindBy(xpath = "//button//span[contains(text(),'EN EUR')]")
    private WebElement home_EN_EUR;

    @FindBy(xpath = "//ul[@class ='HeaderSecondaryBar_secondaryLinks__vysqC']//a[contains(text(),'Blog')]")
    private WebElement blockLink;

    @FindBy(xpath = "//picture[@class='GenericContent_image__A1w7Z GenericContent_fullWidthImage__hGsBe']")
    private WebElement blogImage;

    @FindBy(xpath = "//img[@alt ='Wiggle Logo']")
    private WebElement logo;

    @FindBy(xpath = "//img[@alt='WK10-W-Winter-Sale-Homepage-LMP']")
    private WebElement homeImage;

    @FindBy(xpath = "//div[@class = 'HeaderSecondaryBar_container__ehdyz']//a[contains(text(), 'Help')]")
    private WebElement helpLink;

    @FindBy(xpath = "//p[contains(text(), 'CUSTOMER SERVICES')]")
    private WebElement customerServiceText;

    public boolean isAccountLinkDisplayed() {
        return accountLink.isDisplayed();
    }

    public void clickOnAccountLink() {
        accountLink.click();
    }

    public void clickOnTrustButton() {
        trustButton.click();
    }

    public void clickOnCancelButton() {
        cancelButton.click();
    }

    public void clickOnLanguageSwitcher() {
        languageSwitcher.click();
    }

    public void languageIsUpdatedTo_EN_EUR() {
        home_EN_EUR.isDisplayed();
    }

    public void selectRegionEuropa() {
        europa.click();
    }

    public void selectLanguageAndorra_EN() {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//*[@id='countryListLarge']" +
                        "//a[contains(text(),'Andorra')]" +
                        "[@href='https://www.wiggle.com/eu']")));
        andorra_EN.click();
    }

    public void clickBlog() {
        blockLink.click();
    }

    public void blogImageIsVisible() {
        blogImage.isDisplayed();
    }

    public void clickLogo() {
        logo.click();
    }

    public void homeImageIsVisible() {
        homeImage.isDisplayed();
    }

    public void clickHelpLinkInHeader() {
        helpLink.click();
    }

    public void CustomerServiceTextIsDisplayed() {
        customerServiceText.isDisplayed();
    }

    public void selectSuggestedLanguage(String language) {
        driver.findElement(By.xpath("//*[text()='" + language + "']")).click();
    }

    public void abbreviationIsDisplayed(String text) {
        driver.findElement(By.xpath("//*[text()='" + text + "']")).isDisplayed();
    }
}

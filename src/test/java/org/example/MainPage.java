package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MainPage {
    public WebDriver driver;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath =  "//*[contains(@id, 'cookie-agree')]")
    private WebElement cookieAgreeButton;
    @FindBy(xpath =  "//*[@id=\"pay-section\"]/div/div/div[2]/section/div/h2")
    private WebElement paySectionName;
    @FindBy(xpath =  "//*[contains(@alt, 'Visa')]")
    private WebElement visaImage;
    @FindBy(xpath =  "//*[@id=\"pay-section\"]/div/div/div[2]/section/div/a")
    private WebElement learnMoreLink;
    @FindBy(xpath =  "//*[contains(@placeholder, 'Номер телефона')]")
    private WebElement phoneNumberField;
    @FindBy(xpath =  "//*[contains(@placeholder, 'Сумма')]")
    private WebElement depositField;
    @FindBy(xpath =  "//*[@id=\"pay-connection\"]/button")
    private WebElement continueButton;
    @FindBy(xpath =  "//*[contains(@class, 'bepaid-app')]")
    private WebElement paymentWindow;
    @FindBy(xpath =  "//div[contains(@class, 'header__close-button')]")
    private WebElement closePaymentWindowButton;

    public String getPaySectionText() {
        return paySectionName.getText().trim();
    }

    public boolean visaImageIsDisplayed() {
        return visaImage.isDisplayed();
    }

    public void clickCookieAgreeBtn() {
        cookieAgreeButton.click();
    }

    public void clickLearnMore() {
        learnMoreLink.click();
    }

    public void inputPhoneNumber(String number) {
        phoneNumberField.sendKeys(number);
    }

    public void inputDepositSum(String sum) {
        depositField.sendKeys(sum);
    }

    public void clickContinueBtn() {
        continueButton.click();
    }

    public void clickClosePaymentWindowBtn() {
        closePaymentWindowButton.click();
    }

    public boolean paymentWindowIsDisplayed() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return paymentWindow.isDisplayed();
    }
}

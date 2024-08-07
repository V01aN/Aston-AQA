package org.example;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainTest {
    public static MainPage mainPage;
    public static LearnMorePage learnMorePage;
    public static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        mainPage = new MainPage(driver);
        learnMorePage = new LearnMorePage(driver);
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("mainpage"));
        mainPage.clickCookieAgreeBtn();
    }

    @Test
    public void paySectionTest() {
        String actualText = mainPage.getPaySectionText();
        Assert.assertEquals("Онлайн пополнение\nбез комиссии", actualText);
    }

    @Test
    public void paySectionImagesTest() {
        boolean visaImageIsDisplayed = mainPage.visaImageIsDisplayed();
        Assert.assertEquals(true, visaImageIsDisplayed);
    }

    @Test
    public void learnMoreLinkTest() {
        String currentUrl;
        mainPage.clickLearnMore();
        currentUrl = driver.getCurrentUrl();
        Assert.assertEquals("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/",
                currentUrl);
        driver.navigate().back();
    }

    @Test
    public void continueReplenishmentButtonTest() {
        String actualDepositSum;
        String actualPhoneNumber;
        mainPage.inputPhoneNumber(ConfProperties.getProperty("phonenumber"));
        mainPage.inputDepositSum(ConfProperties.getProperty("depositsum"));
        mainPage.clickContinueBtn();
        Assert.assertTrue(mainPage.paymentWindowIsDisplayed());
        driver.switchTo().frame(1);
        mainPage.clickClosePaymentWindowBtn();
        driver.switchTo().defaultContent();
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}

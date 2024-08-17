package org.example;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainTest {
    public static MainPage mainPage;
    public static LearnMorePage learnMorePage;
    public static WebDriver driver;

    @Before
    public void setUp() {
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
        Assert.assertTrue(actualText.contains("Онлайн пополнение\nбез комиссии"));
    }

    @Test
    public void paySectionImagesTest() {
        boolean visaImageIsDisplayed = mainPage.visaImageIsDisplayed();
        Assert.assertTrue(visaImageIsDisplayed);
    }

    @Test
    public void learnMoreLinkTest() {
        String currentUrl;
        mainPage.clickLearnMore();
        currentUrl = driver.getCurrentUrl();
        Assert.assertEquals("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/",
                currentUrl);
    }

    @Test
    public void continueReplenishmentButtonTest() {
        mainPage.inputPhoneNumber(ConfProperties.getProperty("phonenumber"));
        mainPage.inputDepositSum(ConfProperties.getProperty("depositsum"));
        mainPage.clickContinueBtn();
        Assert.assertTrue(mainPage.paymentWindowIsDisplayed());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}

package TestAutomation.glue;

import TestAutomation.SeleniumConfig.Driver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import org.openqa.selenium.io.FileHandler;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static TestAutomation.pages.Linked_in_LoginPage.closeBrowserInstance;

public class Hooks {
    public static WebDriver driver;
    public static WebDriver driver1;

    public static WebDriver driver2;
    public static WebDriverWait wait;


    @Before
    public WebDriver Initilize() {
        Driver driverClass = new Driver();
        driver = driverClass.Launch("chrome");
        wait = new WebDriverWait(driver, 20);
        return driver;

    }
    @After
    public void Terminate(Scenario scenario) throws IOException {
        WebDriver driver=Hooks.driver2;
        System.out.println("Scenario Failed..!!!");

        if(scenario.isFailed())
        {
            byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshotBytes, "image/png");
            System.out.println("Screen shot taken");
            closeBrowserInstance(); // to close the browser instance
        }
        closeBrowserInstance(); // to close the browser instance
    }






}

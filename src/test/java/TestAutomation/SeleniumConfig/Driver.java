package TestAutomation.SeleniumConfig;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class Driver {

    public static WebDriver driver;

    public WebDriver Launch(String browser) {
        String currentDir = System.getProperty("user.dir");
        String driverPath = currentDir + "/DriverFiles/";
        DesiredCapabilities capabilities = null;

        switch (browser.toLowerCase()) {
            case "IE":
                System.setProperty("Webdriver.ie.driver", driverPath + "IEDriverServer.exe");
                capabilities = DesiredCapabilities.internetExplorer();
                capabilities.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, "http://www.google.com");
                driver = new InternetExplorerDriver(capabilities);
                break;

            case "chrome":
                System.setProperty("Webdriver.chrome.driver", driverPath + "chromedriver.exe");
                capabilities = DesiredCapabilities.chrome();
                capabilities.setBrowserName("chrome");
                driver = new ChromeDriver(capabilities);
                break;



            case "FireFox":

                driver = new FirefoxDriver();
                break;
        }


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        return driver;

    }


}

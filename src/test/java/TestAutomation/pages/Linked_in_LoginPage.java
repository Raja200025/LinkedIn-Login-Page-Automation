package TestAutomation.pages;

import TestAutomation.SeleniumConfig.Driver;
import TestAutomation.glue.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ConfigReader;

import java.io.IOException;

import static TestAutomation.glue.Hooks.wait;
import static utils.ConfigReader.getUsername;

public class Linked_in_LoginPage {




    public static WebDriver driver;
    public static By LoginPageText= By.xpath("//*[contains(text(),'Welcome')]");
    public static By JoinNowLink=By.xpath("//*[contains(text(),'Join now')]");

    public static By SignInLink=By.xpath("//a[contains(text(),'Sign in')]");

    public static By username=By.xpath("//input[@id='session_key']");

    public static  By password =By.xpath("//input[@id='session_password']");

    public static By forgetPasswordLink=By.xpath("//*[text()='Forgot password?']");

    public static By SignInButton=By.xpath("//button[@class='sign-in-form__submit-button']");

    public static By SignInWithGoogleButton=By.xpath("//button[@class='google-sign-in-cta__button']");

    public static By SearchBoxAfterLogin=By.xpath("//button[@id='ember29']");


    public Linked_in_LoginPage()
    {
        driver=Hooks.driver;


    }
    public static void launch1()
    {
        Driver driver1Class=new Driver();
        Hooks.driver2=driver1Class.Launch("chrome");
        wait=new WebDriverWait(Hooks.driver2,20);
    }

    public static void load()
    {
        launch1();
       Hooks.driver2.navigate().to("https://www.linkedin.com/home");
    }

    public static void loginPageIsDisplayed()
    {
        try {
       wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPageText));
        }
        catch (Throwable t)
        {
            t.printStackTrace();
            System.err.println("Login page not displayed ...!!");
        }
    }
    public static void EnterUsername() throws IOException {
        String Strusername= getUsername();
        System.out.println("Username:"+Strusername);

        Hooks.driver2.findElement(username).sendKeys(getUsername());

    }
    public static void EnterPassword() throws IOException {
        Hooks.driver2.findElement(password).sendKeys(ConfigReader.getPassword());
    }
    public static void Click_Sign_in_button()
    {
        Hooks.driver2.findElement(SignInButton).click();
    }
    public static void loggedin()
    {
        try
        {
            wait.until(ExpectedConditions.visibilityOfElementLocated(SearchBoxAfterLogin));
        }
        catch (Throwable T)
        {
            T.printStackTrace();
            System.out.println(T.getMessage());
            System.out.print("it's seems like something wrong in the login ..Please check");

        }
    }
    public static void closeBrowserInstance()
    {
        Hooks.driver2.close();
        Hooks.driver2.quit();


    }

}

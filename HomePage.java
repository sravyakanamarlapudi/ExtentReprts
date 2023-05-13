package Pages;

import Utils.Logs.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    /**
     * Constructor
     */
    public HomePage(WebDriver driver) {
        super(driver);
    }

    /**
     * Variables
     */
    String baseURL = "http://www.google.com/";

    /**
     * Web Elements
     */
    By signInButtonClass = By.className("btnSignIn");

    /**
     * Page Methods
     */
    //Go to Homepage
    public HomePage goTogoogle() {
        Log.info("Opening google Website.");
        driver.get(baseURL);
        return this;
    }

    //Go to LoginPage
    public LoginPage goToLoginPage() {
        Log.info("Going to Login Page..");
        click(signInButtonClass);
        return new LoginPage(driver);
    }
}

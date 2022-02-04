package PageObject;

import Utilities.AppiumHelpers;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPO {
    AppiumHelpers appium;
    AppiumDriver<WebElement> driver;

    public LoginPO(AppiumDriver<WebElement> driver)
    {
        this.driver = driver;
        appium = new AppiumHelpers(driver);

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    /****************** Locator ******************/

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Masukkan email ...']")
    private WebElement EnterEmail;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Password']")
    private WebElement EnterPassword;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Masuk']")
    private WebElement MasukButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Ayo mainkan game-game trandisional indonesia hingga game-game Internasional, dan dapatkan sertifikat dengan menyelesaikan Game tantangan miGa!']")
    private WebElement CoPilotTextWelcome;

    /****************** Function ******************/

    /** @param email is email user **/
    public void UserLoginWithValidEmail(String email) {
        appium.enterText(EnterEmail, email, true);
    }

    /** @param password is password user **/
    public void UserLoginWithValidPassword(String password) {
        appium.enterText(EnterPassword, password, true);
    }

    /** user click masuk button on form login **/
    public void UserClickMasukButtonFormLogin() {
        appium.clickOn(MasukButton);
    }

    /** user Success Masuk Ke MeGames **/
    public String TextWelcomeCoPilot() {
        return appium.getText(CoPilotTextWelcome);
    }
}

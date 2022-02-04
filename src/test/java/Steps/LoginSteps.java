package Steps;

import PageObject.LoginPO;
import Utilities.ThreadManager;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginSteps {
    private AppiumDriver<WebElement> driver = ThreadManager.getDriver();
    private LoginPO login = new LoginPO(driver);

    /****************** STEPS LOGIN ******************/

    @When("user Logged in to MeGames Apps with email {string} and password {string}")
    public void user_logged_in_to_me_games_apps_with_email_and_password(String email, String password) {
        login.UserLoginWithValidEmail(email);
        login.UserLoginWithValidPassword(password);
    }

    @And("user click Masuk Button Again")
    public void user_click_masuk_button_again() {
        login.UserClickMasukButtonFormLogin();
    }

    @Then("the MeGames Apps will have displayed CoPilot Displayed {string}")
    public void the_me_games_apps_will_have_displayed_co_pilot_displayed(String TextCoPilot) {
        Assert.assertEquals(login.TextWelcomeCoPilot(), TextCoPilot, "Text Not Found");
    }
}

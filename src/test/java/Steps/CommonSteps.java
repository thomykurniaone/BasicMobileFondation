package Steps;

import PageObject.CommonPO;
import Utilities.ThreadManager;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;

public class CommonSteps {

    private AppiumDriver<WebElement> driver = ThreadManager.getDriver();
    private CommonPO General = new CommonPO(driver);

    /****************** STEPS LOGIN ******************/

    @Given("user click Masuk Button")
    public void user_click_masuk_button() {
        General.ClickMasukButtonLP();
    }


}

package PageObject;

import Utilities.AppiumHelpers;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CommonPO {
    AppiumHelpers appium;
    AppiumDriver<WebElement> driver;

    public CommonPO(AppiumDriver<WebElement> driver)
    {
        this.driver = driver;
        appium = new AppiumHelpers(driver);

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    /****************** Locator ******************/

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Masuk']")
    private WebElement ClickMasukButtonLP;

    /****************** Function ******************/

    /** Click on Masuk button **/
    public void ClickMasukButtonLP() {
        appium.clickOn(ClickMasukButtonLP);
    }



}

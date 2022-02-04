package Runners;

import Utilities.AppiumServerManager;
import Utilities.Constants;
import Utilities.ThreadManager;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.net.URISyntaxException;

public class BaseRunners extends AbstractTestNGCucumberTests {
    @BeforeClass(alwaysRun=true)
    @Parameters({"DeviceUdid","DeviceSerial","AppiumPort","SystemPort"})
    public void beforeClass(String deviceUdid, String deviceSerial, String appiumPort, String systemPort) throws IOException, InterruptedException, URISyntaxException {
        if(Constants.PLATFORM.equalsIgnoreCase("local") || Constants.PLATFORM.equalsIgnoreCase("openstf")) {
            ThreadManager.setAllForAndroid(deviceUdid,appiumPort,systemPort);
            AppiumServerManager.startAppium();
        }
    }

    @AfterClass(alwaysRun=true)
    @Parameters({"DeviceSerial"})
    public void afterClass(String deviceSerial) throws IOException, URISyntaxException, InterruptedException {
        if(Constants.PLATFORM.equalsIgnoreCase("local") || Constants.PLATFORM.equalsIgnoreCase("openstf")) {
            AppiumServerManager.stopAppium();
        }
    }
}

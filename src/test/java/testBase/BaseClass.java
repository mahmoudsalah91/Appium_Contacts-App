package testBase;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import java.net.MalformedURLException;
import java.net.URL;



public class BaseClass {

   public AppiumDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps=new DesiredCapabilities();
        caps.setCapability("platformName","Android");
        caps.setCapability("automationName","UiAutomator2");
        caps.setCapability("platformVersion","10");
        caps.setCapability("deviceName","emulator-5554");
        caps.setCapability("appPackage","com.android.contacts");
        caps.setCapability("appActivity","com.android.contacts.activities.PeopleActivity");
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),caps);
    }




    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }




}



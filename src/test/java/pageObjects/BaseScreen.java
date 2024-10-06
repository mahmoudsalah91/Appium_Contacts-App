package pageObjects;

import io.appium.java_client.AppiumDriver;


public class BaseScreen {
    AppiumDriver driver;
    BaseScreen(AppiumDriver driver){
       this.driver=driver;
    }
}

package pageObjects;

import java.time.Duration;
import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class HomeScreen extends BaseScreen{
    public HomeScreen(AppiumDriver driver) {
        super(driver);
    }
    WebDriverWait wait  = new WebDriverWait(driver,20);

    By btn_Add_loc= By.id("floating_action_button");
    By Btn_Cancel_loc=By.id("com.android.contacts:id/left_button");




    public void ClickAdd(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(btn_Add_loc)).click();
    }

    public void ClickCancel()  {

        wait.until(ExpectedConditions.visibilityOfElementLocated(Btn_Cancel_loc)).click();
    }


}

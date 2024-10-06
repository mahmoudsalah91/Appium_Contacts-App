package pageObjects;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SaveContactScreen extends BaseScreen{



    public SaveContactScreen(AppiumDriver driver) {
        super(driver);
    }
    WebDriverWait wait  = new WebDriverWait(driver,20);

    By txt_FullName_loc= By.id("com.android.contacts:id/large_title");
    By txt_Phone_loc= By.xpath("//android.widget.RelativeLayout[1]//android.widget.TextView[1]");
    By txt_Email_loc= By.xpath("//android.widget.RelativeLayout[2]//android.widget.TextView[1]");

    public String getFullName()
    {
       String fullName = wait.until(ExpectedConditions.visibilityOfElementLocated(txt_FullName_loc)).getText();
        return fullName;
    }

    public String getPhone()
    {
        String Phone = wait.until(ExpectedConditions.visibilityOfElementLocated(txt_Phone_loc)).getText();
        return Phone;
    }

    public String getEmail()
    {
        String Email = wait.until(ExpectedConditions.visibilityOfElementLocated(txt_Email_loc)).getText();
        return Email;
    }


}

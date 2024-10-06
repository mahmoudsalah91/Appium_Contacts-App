package pageObjects;

import com.github.javafaker.Faker;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class NewContactScreen extends BaseScreen{
    public NewContactScreen(AppiumDriver driver) {
        super(driver);
    }

    String FirstName;
    String LastName;
    String Phone;
    String Email;
    Faker faker= new Faker();

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }



    public String getPhone() {
        return Phone;
    }

    public String getEmail() {
        return Email;
    }


    By txt_FirstName_loc= By.xpath("//*[contains(@text,'First name')]");
    By txt_LastName_loc= By.xpath("//*[contains(@text,'Last name')]");
    By txt_Phone_loc= By.xpath("//*[contains(@text,'Phone')]");
    By txt_Email_loc= By.xpath("//*[contains(@text,'Email')]");
    By btn_Save_loc= By.id("editor_menu_save_button");

    public String setFirstName()
    {
         FirstName = faker.name().firstName();
        return FirstName;
    }
    public String setLastName()
    {
         LastName = faker.name().lastName();
        return LastName;
    }

    public String setPhone()
    {
         Phone = faker.phoneNumber().phoneNumber();
        return Phone;
    }
    public String setEmail()
    {
         Email = faker.internet().safeEmailAddress();
        return Email;
    }

    public void addValidData()
    {
        driver.findElement(txt_FirstName_loc).sendKeys(setFirstName());
        driver.findElement(txt_LastName_loc).sendKeys(setLastName());
        driver.findElement(txt_Phone_loc).sendKeys(setPhone());
        driver.findElement(txt_Email_loc).sendKeys(setEmail());
    }

    public void saveDate()
    {
        driver.findElement(btn_Save_loc).click();
    }
}

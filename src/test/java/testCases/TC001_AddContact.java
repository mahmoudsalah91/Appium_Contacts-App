package testCases;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.HomeScreen;
import pageObjects.NewContactScreen;
import pageObjects.SaveContactScreen;
import testBase.BaseClass;

import java.io.IOException;

public class TC001_AddContact extends BaseClass {
    HomeScreen home;
    NewContactScreen contact;
    SaveContactScreen save;
    SoftAssert soft = new SoftAssert();
    @Test
    public void AddContacts()  {
         home=new HomeScreen(driver);
         home.ClickAdd();
         home.ClickCancel();
         contact=new NewContactScreen(driver);
         contact.addValidData();
         contact.saveDate();
         save=new SaveContactScreen(driver);
         String actualFullName=save.getFullName();
         String actualPhone=save.getPhone();
         String actualEmail=save.getEmail();

         String expectedFullName = contact.getFirstName()+" "+contact.getLastName();
         String expectedPhone = contact.getPhone();
         String expectedEmail = contact.getEmail();

         soft.assertEquals(actualFullName,expectedFullName);
         soft.assertEquals(actualPhone,expectedPhone);
         soft.assertEquals(actualEmail,expectedEmail);

         soft.assertAll();

    }
}

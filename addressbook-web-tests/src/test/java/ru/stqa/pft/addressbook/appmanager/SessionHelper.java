package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase{

    public SessionHelper(WebDriver driver) {
        super(driver);
    }
    public void login(String username, String pssword) {
        type(By.name("user"),username);
        type(By.name("pass"), pssword);
        click(By.xpath("//input[@value='Login']"));
    }
}

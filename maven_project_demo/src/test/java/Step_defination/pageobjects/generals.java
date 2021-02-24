package Step_defination.pageobjects;

import Step_defination.constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class generals {

    // locator
    public final By tabLogout = By.xpath("//div[@id='menu']//a[@href='/Account/Logout']");
    private final By tabLogin = By.xpath("//div[@id='menu']//a[@href='/Account/Login.cshtml']");

    // element methods
    public WebElement getTabLogin(){
        return Constant.WEBDRIVER.findElement(tabLogin);
    }
     public WebElement getTabLogout(){
        return Constant.WEBDRIVER.findElement(tabLogout);
     }

     //methods
    public void gotoLoginPage(){
        this.getTabLogin().click();
    }

    public void gotoLogoutPage(){
        this.getTabLogout().click();
    }
}

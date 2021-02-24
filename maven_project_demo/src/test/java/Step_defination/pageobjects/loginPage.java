package Step_defination.pageobjects;

import Step_defination.constant.Constant;
import Step_defination.railway_objetcs.AccountInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class loginPage {
    public WebElement getTxtUsername() {
        return Constant.WEBDRIVER.findElement(By.id("username"));
    }

    public WebElement getTxtPassword() {
        return Constant.WEBDRIVER.findElement(By.id("password"));
    }

    public WebElement getBtnLogin() {
        return Constant.WEBDRIVER.findElement(By.xpath("//input[@value='Login']"));
    }

    public void enterUserName(String username) {
        getTxtUsername().clear();
        this.getTxtUsername().sendKeys(username);
    }

    public void enterPassWord(String password) {
        getTxtPassword().clear();
        this.getTxtPassword().sendKeys(password);
    }

    //method
    public void login(AccountInfo accountInfo) {

        enterUserName(accountInfo.getUsername());
        enterPassWord(accountInfo.getPassword());
        this.getBtnLogin().click();
    }
}

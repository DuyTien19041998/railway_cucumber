package Step_defination.stepDefination;

import Step_defination.constant.Constant;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class logout{

    @Given("Navigate to Railway website")
    public void gotoRailway(){
        Constant.WEBDRIVER = new ChromeDriver();
        Constant.WEBDRIVER.navigate().to(Constant.RAILWAY_URL);
    }

    @When("I fill username")
    public void enterUsername(){
        Constant.WEBDRIVER.findElement(By.id("username")).sendKeys();
    }

    @When(" I fill password")
    public void enterPassword(){
        Constant.WEBDRIVER.findElement(By.id("pasword")).sendKeys();
    }

    @When("Click button login")
    public void clickBtnLogin(){
        Constant.WEBDRIVER.findElement(By.xpath("//input[@value='Login']")).click();
    }

    @When(" logout ")
    public void gotoLogout(){
        Constant.WEBDRIVER.findElement(By.xpath("//div[@id='menu']//a[@href='/Account/Logout']")).click();
    }

}

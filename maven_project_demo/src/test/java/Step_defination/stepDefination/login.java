package Step_defination.stepDefination;

import Step_defination.constant.Constant;
import Step_defination.testbase.testbase;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class login  extends testbase {

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

    @Then("Login successfully")
    public void userLoginSuccessfully(){
        String actual = "demo@gmail.com";
        Assert.assertEquals("Welcome",actual);
    }
}

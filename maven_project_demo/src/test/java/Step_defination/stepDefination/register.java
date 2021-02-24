package Step_defination.stepDefination;

import Step_defination.constant.Constant;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class register {
    @Given("Navigate to Railway website")
    public void gotoRailway(){
        Constant.WEBDRIVER = new ChromeDriver();
        Constant.WEBDRIVER.navigate().to(Constant.RAILWAY_URL);
    }

    @When("Fill email")
    public void fillEmail(){
        Constant.WEBDRIVER.findElement(By.id("email")).sendKeys("demo@gmail.com");
    }

    @When(" Fill password")
    public void fillPassword(){
        Constant.WEBDRIVER.findElement(By.id("email")).sendKeys("tranduytien");
    }

    @When("Fill confirmpassword")
    public void fillConfirmPassword(){
        Constant.WEBDRIVER.findElement(By.id("confirmPassword")).sendKeys("tranduytien");
    }

    @When("Fill PiD")
    public void fillPid(){
        Constant.WEBDRIVER.findElement(By.xpath("//li[@class='pid-number']//label[@class='validation-error']")).sendKeys("12345678");
    }

    @When("Click button register")
    public void clickBtnRegister(){
        Constant.WEBDRIVER.findElement(By.xpath("//input[@value='Register']")).click();
    }

}

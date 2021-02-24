package Step_defination.common;

import Step_defination.constant.Constant;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utilities {

    public static void selectBrowser(String browserName) {
        switch (browserName) {
            case "chrome":
                String path = System.getProperty("user.dir") + "\\executables\\chromeDriver.exe";
                System.setProperty("webdriver.chrome.driver", path);
                Constant.WEBDRIVER = new ChromeDriver();
                break;
            case "fireFox":
                path = System.getProperty("user.dir") + "\\executables\\geckodriver.exe";
                System.setProperty("webdriver.gecko.driver", path);
                Constant.WEBDRIVER = new FirefoxDriver();
                break;
        }
    }

    public static void maximizeBrowser() {
        Constant.WEBDRIVER.manage().window().maximize();
    }
}

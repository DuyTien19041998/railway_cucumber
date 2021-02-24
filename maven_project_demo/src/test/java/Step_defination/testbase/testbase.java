package Step_defination.testbase;

import Step_defination.common.Utilities;
import Step_defination.constant.Constant;
import org.junit.After;
import org.junit.Before;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class testbase {

    @Parameters("browser")
    @Before
    public void BeforeScenario(@Optional("chrome") String nameBrowser){
        System.out.println("pre-condition");
        Utilities.selectBrowser(nameBrowser);
        Utilities.maximizeBrowser();
    }

    @After
    public void AfterScenario(){
        System.out.println("Post-condition");
        Constant.WEBDRIVER.quit();
    }
}

package Step_defination.pageobjects;

import Step_defination.constant.Constant;

public class homepage extends generals {

    public static homepage open(){
        Constant.WEBDRIVER.navigate().to(Constant.RAILWAY_URL);
        return new homepage();
    }
}

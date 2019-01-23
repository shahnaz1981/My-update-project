package testPages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SearchFeatures;
import reporting.TestLogger;

public class TestSearchFeature extends SearchFeatures {
    SearchFeatures sF;
    @BeforeMethod
    public void getNews(){ sF= PageFactory.initElements(driver,SearchFeatures.class);}
    @Test
    public void test1()throws InterruptedException{
        TestLogger.log("Browser is launched");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sF.searchMenu();
    }
}

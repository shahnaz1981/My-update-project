package testPages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SportPage;

public class TestSportPage extends SportPage {
SportPage sp;

    @BeforeMethod
    public void getNews() { sp = PageFactory.initElements(driver, SportPage.class);
    }
    @Test
    public void testMouseOverHandle()throws InterruptedException{
        sp.mouseOverhandle();
    }
}
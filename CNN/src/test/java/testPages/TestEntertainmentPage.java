package testPages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.EntertainmentPage;

public class TestEntertainmentPage extends EntertainmentPage {
    EntertainmentPage page;
    @BeforeMethod
          public void getNews(){ page= PageFactory.initElements(driver, EntertainmentPage.class);}
    @Test
    public void testFaceBookLogo(){
        page.searchLogo();
    }

}

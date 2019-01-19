package testPages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CreateAccountPage;


public class TestCreateAccountPage extends CreateAccountPage {
CreateAccountPage pp;

    @BeforeMethod
       public void getNews() { pp = PageFactory.initElements(driver, CreateAccountPage.class);}
    @Test
        public void testSignUpOption()throws InterruptedException{
        pp.searchSignUpOption();
 }
}
package testPages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SigninPage;

public class TestSigninPage extends SigninPage {
    SigninPage login;
    @BeforeMethod
        public void getNews(){ login= PageFactory.initElements(driver, SigninPage.class);}

    @Test
        public void testSignInOption(){
        login.signinFunction();
    }
    @Test
        public void nagativeTestForSignIn(){
        login.signinFunction();
        Assert.assertEquals(login.signinFunctionVarify(),"Error! Please check your email and password.");
    }


}

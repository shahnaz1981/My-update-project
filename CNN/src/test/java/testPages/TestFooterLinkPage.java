package testPages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FooterLinkPage;

public class TestFooterLinkPage extends FooterLinkPage {
    FooterLinkPage fP;
    @BeforeMethod
    public void setFooterPage(){fP= PageFactory.initElements(driver,FooterLinkPage.class);
    }
    @Test
    public void facebookLinkTest() throws InterruptedException {
        String actual = fP.facebookIcon();
        String expected = "https://www.facebook.com/CNNent";
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void twitterLinkTest() throws InterruptedException {
        String actual = fP.twitterIcon();
        String expected = "https://twitter.com/CNNent";
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void instagramLinkTest() throws InterruptedException {
        String actual = fP.twitterIcon();
        String expected = "https://www.instagram.com/CNNent";
        Assert.assertEquals(actual, expected);
    }


}

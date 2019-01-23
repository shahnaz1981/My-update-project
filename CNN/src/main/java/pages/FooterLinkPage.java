package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class FooterLinkPage extends CommonAPI {
    @FindBy(linkText ="Entertainment" )
    WebElement entertainent;
    @FindBy(xpath = "//a[@class='cnn-icon'and@href='http://facebook.com/CNNent']")
    WebElement facebooktab;
    @FindBy(xpath = "//a[@class='cnn-icon'and@href='http://twitter.com/CNNent']")
    WebElement twittertab;
    @FindBy(xpath ="//a[@class='cnn-icon'and@href='http://instagram.com/cnnentertainment']" )
    WebElement instagramtab;
    public String facebookIcon() throws InterruptedException {
        //New Tab Handle
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        entertainent.click();
        facebooktab.click();
        Thread.sleep(5000);
        System.out.println(driver.getTitle());
        for (String facebook : driver.getWindowHandles()) {
            driver.switchTo().window(facebook);
        }System.out.println(driver.getTitle());
        String url = driver.getCurrentUrl();
        System.out.println(url);
        return url;
    }
    public String twitterIcon() throws InterruptedException {
        //New Tab Handle
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        entertainent.click();
        twittertab.click();
        Thread.sleep(5000);
        System.out.println(driver.getTitle());
        for (String twitter : driver.getWindowHandles()) {
            driver.switchTo().window(twitter);
        }System.out.println(driver.getTitle());
        String url = driver.getCurrentUrl();
        System.out.println(url);
        return url;
    }
    public String instagramIcon() throws InterruptedException {
        //New Tab Handle
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        entertainent.click();
        instagramtab.click();
        Thread.sleep(5000);
        System.out.println(driver.getTitle());
        for (String instagram : driver.getWindowHandles()) {
            driver.switchTo().window(instagram);
        }System.out.println(driver.getTitle());
        String url = driver.getCurrentUrl();
        System.out.println(url);
        return url;
    }
}

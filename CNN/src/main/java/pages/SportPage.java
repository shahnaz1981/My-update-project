package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SportPage extends CommonAPI {
    @FindBy(linkText = "Sports")
    WebElement sportsLink;

    public void mouseOverhandle()throws InterruptedException {
        sportsLink.click();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.linkText("NFL"))).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Buffalo")).click();
    }
}

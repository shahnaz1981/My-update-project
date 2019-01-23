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
    public void mouseOverhandle1()throws InterruptedException {
        sportsLink.click();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.linkText("CFB"))).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Connecticut")).click();
    }
    public void mouseOverhandle2()throws InterruptedException {
        sportsLink.click();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.linkText("NBA"))).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Boston")).click();}
    public void mouseOverhandle3()throws InterruptedException {
        sportsLink.click();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.linkText("World Football"))).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Champions League Home")).click();}
    public void mouseOverhandle4()throws InterruptedException {
        sportsLink.click();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.linkText("MLB"))).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Baltimore")).click();}
    public void mouseOverhandle5()throws InterruptedException {
        sportsLink.click();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.linkText("NHL"))).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Florida")).click();}
    public void mouseOverhandle6()throws InterruptedException {
        sportsLink.click();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.linkText("CBB"))).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Dayton")).click();}
    public void mouseOverhandle7()throws InterruptedException {
        sportsLink.click();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.linkText("CBB"))).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Dayton")).click();}
    public void mouseOverhandle8()throws InterruptedException {
        sportsLink.click();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.linkText("CBB"))).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Dayton")).click();}
    public void mouseOverhandle9()throws InterruptedException {
        sportsLink.click();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.linkText("MMA"))).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Archives")).click();}
    public void mouseOverhandle10()throws InterruptedException {
        sportsLink.click();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.linkText("WWE"))).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Royal Rumble")).click();}
    public void mouseOverhandle11()throws InterruptedException {
        sportsLink.click();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.linkText("MMA"))).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Odds")).click();}
    public void mouseOverhandle12()throws InterruptedException {
        sportsLink.click();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.linkText("Tennis"))).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Australian Open")).click();}
    public void mouseOverhandle13()throws InterruptedException {
        sportsLink.click();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.linkText("Boxing"))).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Boxing")).click();}
    public void mouseOverhandle14()throws InterruptedException {
        sportsLink.click();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.linkText("More"))).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.linkText("USMNT")).click();}
    public void mouseOverhandle15()throws InterruptedException {
        sportsLink.click();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.linkText("Shows"))).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Simms & Lefkoe")).click();}
    public void mouseOverhandle16()throws InterruptedException {
        sportsLink.click();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.linkText("Shows"))).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.linkText("The Champions")).click();}
    public void mouseOverhandle17()throws InterruptedException {
        sportsLink.click();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.linkText("More"))).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.linkText("USWNT")).click();}
    public void mouseOverhandle18()throws InterruptedException {
        sportsLink.click();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.linkText("CFB"))).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Boston College")).click();}
    public void mouseOverhandle19()throws InterruptedException {
        sportsLink.click();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.linkText("CFB"))).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Illinois")).click();}
    public void mouseOverhandle20()throws InterruptedException {
        sportsLink.click();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.linkText("World Football"))).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Chelsea")).click();}

}

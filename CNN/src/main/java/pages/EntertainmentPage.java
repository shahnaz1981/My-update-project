package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EntertainmentPage extends CommonAPI {
@FindBy(linkText = "Entertainment")
WebElement entertainmentLink;
@FindBy(xpath ="//a[ @class='cnn-icon'and@ href='http://facebook.com/CNNent']" )
WebElement faceBookLogo;
@FindBy(xpath = "//*[@id=\"entertainment-drawer\"]/div/ul[1]/li[1]/a")
WebElement stars;
@FindBy(xpath = "//*[@id=\"entertainment-drawer\"]/div/ul[1]/li[2]/a")
WebElement screen;
@FindBy(xpath = "//*[@id=\"entertainment-drawer\"]/div/ul[1]/li[3]/a")
WebElement binge;
@FindBy(xpath = "//*[@id=\"entertainment-drawer\"]/div/ul[1]/li[4]/a")
WebElement culture;
@FindBy(xpath = "//*[@id=\"entertainment-drawer\"]/div/ul[1]/li[5]/a")
WebElement media;
public String searchLogo (){
    entertainmentLink.click();
    System.out.println("Show logo Display status :"+faceBookLogo.isDisplayed());
    String location="facebook logo location"+faceBookLogo.getLocation();
    System.out.println("facebook logo location:"+faceBookLogo.getLocation());
    return location;
}
public String getTitle(){
    driver.findElement(By.linkText("Entertainment")).click();
    String actual=driver.getTitle();
    return actual;}
public void searchStarsLink(){
    entertainmentLink.click();
    stars.click();
}
 public String getTitle1(){
     entertainmentLink.click();
     driver.findElement(By.xpath("//*[@id=\"entertainment-drawer\"]/div/ul[1]/li[1]/a")).click();
     String actual=driver.getTitle();
     return actual;}
 public void searchScreenLink(){
      entertainmentLink.click();
      screen.click();}
 public String getTitle2(){
      entertainmentLink.click();
      driver.findElement(By.xpath("//*[@id=\"entertainment-drawer\"]/div/ul[1]/li[2]/a")).click();
      String actual=driver.getTitle();
      return actual;}

 public void searchBingeLink(){
      entertainmentLink.click();
      binge.click();}
 public String getTitle3(){
      entertainmentLink.click();
      driver.findElement(By.xpath("//*[@id=\"entertainment-drawer\"]/div/ul[1]/li[3]/a")).click();
      String actual=driver.getTitle();
      return actual;}
 public void searchCultureLink(){
      entertainmentLink.click();
      culture.click();}
 public String getTitle4(){
       entertainmentLink.click();
       driver.findElement(By.xpath("//*[@id=\"entertainment-drawer\"]/div/ul[1]/li[4]/a")).click();
       String actual=driver.getTitle();
       return actual;}
 public void searchMediaLink(){
  entertainmentLink.click();
  media.click();}
 public String getTitle5(){
  entertainmentLink.click();
  driver.findElement(By.xpath("//*[@id=\"entertainment-drawer\"]/div/ul[1]/li[5]/a")).click();
  String actual=driver.getTitle();
  return actual;}

}

package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class HomePage extends CommonAPI {
    @FindBy(id="logo")
    public static WebElement findlogo;
    @FindBy(id="search-button")
    public static WebElement searchbutton;
    @FindBy(id="search-input-field")
    public static WebElement searchbox;
    @FindBy(xpath = "//label[@ for='collection_all']")
    public static WebElement getText;
    @FindBy(linkText="U.S.")
    public static WebElement getUsTopStoriesAndLatestHeadlines;
    @FindBy(linkText = "World")
    public static WebElement getWorldBreakingNewsVideosAndHeadlines;
    @FindBy(linkText="Politics")
    WebElement getPoliticalNews;
    @FindBy(linkText = "Business")
    WebElement getBusinessNews;
    @FindBy(linkText="Video")
    WebElement getVideos;
    @FindBy(xpath = "//div[@class='edition-picker__current-edition']")
    WebElement handleUSEdition;
    @FindBy(xpath = "//span[@for='edition_international']")
    WebElement intenationalOption;
    @FindBy(xpath="//button[@class='js-edition-confirm edition-picker__confirm-button']")
    WebElement confirmButton;
    @FindBy(linkText = "Opinion")
    WebElement getOpinionOfCnn;
    @FindBy(linkText = "Health")
    WebElement healthInformation;
    @FindBy(linkText = "Entertainment")
    WebElement findEntertainment;
    @FindBy(linkText = "Style")
    WebElement findStyleOpOfCnn;
    @FindBy(linkText = "Travel")
    public WebElement chechTraOption;
    @FindBy(xpath ="//a[@class=\"Header__section\"]" )
    public WebElement destinationInfo;
    @FindBy(linkText = "Bangkok")
    public WebElement getTextOfBangkok;
    @FindBy(id ="menu" )
    public WebElement menuBar;
    @FindBy(xpath = "//div[@id='nav-expanded']/div[@class='nav-flyout-footer']/form[@class='edition-picker__radio-buttons']//span[.='International']")
    public WebElement selectOption;
    @FindBy(xpath="//div[@id='nav-expanded']/div[@class='nav-flyout-footer']/form[@class='edition-picker__radio-buttons']/button[.='Confirm']")
    public WebElement confirmOption;
    @FindBy(xpath="/html/body/div[5]/div[@class='pg-no-rail pg-wrapper']//div[@class='collectionList']/ul[@class='facet_list']//label[.='Stories']")
    public WebElement getText2;
    public String getTitle(){
        String text=driver.getTitle();return text;}
    public String getTitle1(){
        driver.findElement(By.linkText("U.S.")).click();
        String actual=driver.getTitle();
        return actual;}
    public  static boolean testlogo(){ boolean logo=findlogo.isDisplayed();return logo;}
    public void searchUsNews(){ getUsTopStoriesAndLatestHeadlines.click();}
    public void searchWorldNews(){ getWorldBreakingNewsVideosAndHeadlines.click();}
    public void searchPoliticalNews(){ getPoliticalNews.click();}
    public void searchBusinessNews(){ getBusinessNews.click(); }
    public void searchVideos(){getVideos.click();}
    public void searchOpinionOfCnn(){getOpinionOfCnn.click();}
    public void searchHealthInfo(){healthInformation.click();}
    public void searchEntertainmentOption(){findEntertainment.click();}
    public void searStyOpOfCnn(){findStyleOpOfCnn.click();}
    public void searchTraOpOfCnn(){chechTraOption.click();}
    public void searchDesOp(){destinationInfo.click(); }
    public void selectMenuBar(){menuBar.click();}
    public void selectTheOp(){selectOption.click();}
    public void selectConfirmOp(){confirmOption.click();}
    public String getTitle2(){
        driver.findElement(By.linkText("World")).click();
        String actual=driver.getTitle();
        String expected="World news – breaking news, videos and headlines - CNN";
        Assert.assertEquals(actual,expected);return actual;}
    public  String searchTextOfBan()throws InterruptedException{chechTraOption.click();destinationInfo.click();
       String actual=getTextOfBangkok.getText();
       return actual; }
    public static void searchbut(){
        searchbutton.click();}
    public static void searchbox(){
        searchbox.sendKeys("us", Keys.ENTER);}
    public static String searchtext(){
      searchbutton.click();searchbox.sendKeys("us", Keys.ENTER);
      String actual=getText.getText();
      return actual;}
    public void dropdownHandle1()throws InterruptedException{
        menuBar.click();
        sleepFor(7);
        Actions action=new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//div[@id='nav-expanded']/div[@class='nav-flyout-footer']/form[@class='edition-picker__radio-buttons']//span[.='International']"))).click()
                .moveToElement(driver.findElement(By.xpath("//div[@id='nav-expanded']/div[@class='nav-flyout-footer']/form[@class='edition-picker__radio-buttons']/button[.='Confirm']"))).click()
                .build().perform();}
    public String  searchText()throws InterruptedException{
        searchbutton.click();searchbox.sendKeys("world", Keys.ENTER);
        String actual=getText2.getText();
        return actual; }

}

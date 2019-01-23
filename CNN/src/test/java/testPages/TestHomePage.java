package testPages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class TestHomePage extends HomePage {
    HomePage page;
    @BeforeMethod
    public void getNews(){ page= PageFactory.initElements(driver, HomePage.class);}
    @Test
    public void logotsb(){ boolean logo=  HomePage.testlogo();
     Assert.assertEquals(logo,true);}
    @Test
    public void titleTest(){ String text= page.getTitle();
       String expected="CNN - Breaking News, Latest News and Videos";
       Assert.assertEquals(text,expected);}
    @Test
    public void getText1()throws InterruptedException{
        page.searchTextOfBan();
        String actual=getTextOfBangkok.getText();
        String expected="Bangkok";
        Assert.assertEquals(actual,expected);}
    @Test
    public void testUsNews() { page.searchUsNews();}
    @Test
    public void testWordNews(){ page.searchWorldNews(); }
    @Test
    public void testPoliticalNews(){ page.searchPoliticalNews(); }
    @Test
    public void testBusinessNews(){page.searchBusinessNews();}
    @Test
    public void testOpinionOptionOfCnn(){page.searchOpinionOfCnn();}
    @Test
    public void testVideos(){page.searchVideos();}
    @Test
    public void testHealthInfo(){page.searchHealthInfo();}
    @Test
    public void testEntOpOfCnn(){page.searchEntertainmentOption();}
    @Test
    public void testStOp(){page.searStyOpOfCnn();}
    @Test
    public void searcBut(){ HomePage.searchbut(); }
    @Test
    public void searchBox(){ HomePage.searchbox(); }
    @Test
    public void getText()throws InterruptedException{
        page.searchtext();
        String actual=getText.getText();
        String expected="Everything";
        Assert.assertEquals(actual,expected);}
    @Test
    public void TestDropHandle()throws InterruptedException{page.dropdownHandle1();}
    @Test
    public void titieVariry1(){ page.getTitle1();
        String actual=driver.getTitle();
        String expected="US News – Top national stories and latest headlines - CNN";
        Assert.assertEquals(actual,expected);}
    @Test
    public void titleVarify2(){page.getTitle2();
        String actual=driver.getTitle();
        String expected="World news – breaking news, videos and headlines - CNN";
        Assert.assertEquals(actual,expected);}
    @Test
    public void getText2()throws InterruptedException{ page.searchText();
        String actual=getText2.getText();
        String expected="Stories";
        Assert.assertEquals(actual,expected);      }








}

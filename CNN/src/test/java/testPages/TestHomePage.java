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
    public void titleTest(){ String text= page.getTitle();String expected="CNN - Breaking News, Latest News and Videos";
     Assert.assertEquals(text,expected);}
    @Test
    public void getText1()throws InterruptedException{ page.searchTextOfBan();}
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
    public void getText()throws InterruptedException{ page.searchtext(); }
    @Test
    public void TestDropHandle()throws InterruptedException{page.dropdownHandle1();}
    @Test
    public void titieVariry1(){ page.getTitle1();}
    @Test
    public void titleVarify2(){page.getTitle2();}
    @Test
    public void getText2()throws InterruptedException{ page.searchText();}








}

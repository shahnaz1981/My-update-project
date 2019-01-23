package testPages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.PoliticalPage;

import java.util.List;

public class TestPoliticalPage extends PoliticalPage {
    PoliticalPage pp;
    @BeforeMethod
    public void getNews(){ pp= PageFactory.initElements(driver, PoliticalPage.class);}
    @Test
    public void testPoliticalNews(){
        pp.searchPoliticalNews(); }
    @Test
    public void testSupremeCourtNews() {
        pp.searchSupremeCourtNews();}
    @Test
    public void test2018ElectionResultNews(){
        pp.search2018ElectionResultNews();
    }
    @Test
    public void testPoliticalNewsTitle(){
        String actual=pp.searchTitle();
        Assert.assertEquals(actual,"CNN - Breaking News, Latest News and Videos"); }
    @Test
    public void testPoliticalHeaderLink(){
        pp.searchPoliticalNews1();
       List actual= pp.webElements();
       List expected=pp.expectedAllWebElements();
       Assert.assertEquals(actual,expected); }
    @Test
    public void testCurrentUrl(){
       String actual= pp.SearchCurrentUrl();
       Assert.assertEquals(actual,"https://www.cnn.com/politics"); }
    @Test
    public void testPoliticalText(){
        String actual=pp.searchPoliticalNews1();
        Assert.assertEquals(actual,"Government shutdown negotiations appear frozen in place"); }



}

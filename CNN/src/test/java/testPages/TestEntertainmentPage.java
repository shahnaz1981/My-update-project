package testPages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.EntertainmentPage;

public class TestEntertainmentPage extends EntertainmentPage {
    EntertainmentPage page;
    @BeforeMethod
          public void getNews(){ page= PageFactory.initElements(driver, EntertainmentPage.class);}
    @Test
    public void testFaceBookLogo(){
        page.searchLogo();
    }
    @Test
    public void titleTest(){ String text= page.getTitle();
        String expected="Entertainment News - Celebrities, Movies, TV, Music - CNN";
        Assert.assertEquals(text,expected);}
    @Test
    public void testStarsLink(){
        page.searchStarsLink();}
    @Test
    public void titleTest1(){ String text= page.getTitle1();
        String expected="Celebrities - Entertainment News - CNN";
        Assert.assertEquals(text,expected);}
    @Test
    public void testScreenLink(){
        page.searchScreenLink();}
    @Test
    public void titleTest2(){ String text= page.getTitle2();
        String expected="Movies - Entertainment News - CNN";
        Assert.assertEquals(text,expected);}
    @Test
    public void testbingeLink(){
        page.searchBingeLink();}
    @Test
    public void titleTest3(){ String text= page.getTitle3();
        String expected="TV Shows - Entertainment News - CNN";
        Assert.assertEquals(text,expected);}
    @Test
    public void testCultureLink(){
        page.searchCultureLink();}
    @Test
    public void titleTest4(){ String text= page.getTitle4();
        String expected="Pop Culture  - Entertainment News - CNN";
        Assert.assertEquals(text,expected);}
    @Test
    public void testMediaLink(){
        page.searchMediaLink();}
    @Test
    public void titleTest5(){ String text= page.getTitle5();
        String expected="Pop Culture  - Entertainment News - CNN";
        Assert.assertEquals(text,expected);}
}

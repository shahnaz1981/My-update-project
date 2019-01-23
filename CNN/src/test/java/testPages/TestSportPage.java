package testPages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SportPage;

public class TestSportPage extends SportPage {
SportPage sp;

    @BeforeMethod
    public void getNews() { sp = PageFactory.initElements(driver, SportPage.class);
    }
    @Test
    public void testMouseOverHandle()throws InterruptedException{
        sp.mouseOverhandle();
    }
    @Test
    public void testMouseOverHandle1()throws InterruptedException{
        sp.mouseOverhandle1();}
    @Test
    public void testMouseOverHandle2()throws InterruptedException{
        sp.mouseOverhandle2();}
    @Test
     public void testMouseOverHandle3()throws InterruptedException{
         sp.mouseOverhandle3();}
    @Test
    public void testMouseOverHandle4()throws InterruptedException{
        sp.mouseOverhandle4();}
    @Test
    public void testMouseOverHandle5()throws InterruptedException{
        sp.mouseOverhandle5();}
    @Test
    public void testMouseOverHandle6()throws InterruptedException{
        sp.mouseOverhandle6();}
    @Test
    public void testMouseOverHandle7()throws InterruptedException{
        sp.mouseOverhandle7();}
    @Test
    public void testMouseOverHandle8()throws InterruptedException{
        sp.mouseOverhandle8();}
    @Test
    public void testMouseOverHandle9()throws InterruptedException{
        sp.mouseOverhandle9();}
    @Test
    public void testMouseOverHandle10()throws InterruptedException{
        sp.mouseOverhandle10();}
    @Test
    public void testMouseOverHandle11()throws InterruptedException{
        sp.mouseOverhandle11();}
    @Test
    public void testMouseOverHandle12()throws InterruptedException{
        sp.mouseOverhandle12();}
    @Test
    public void testMouseOverHandle13()throws InterruptedException{
        sp.mouseOverhandle13();}
    @Test
    public void testMouseOverHandle14()throws InterruptedException{
        sp.mouseOverhandle14();}
    @Test
    public void testMouseOverHandle15()throws InterruptedException{
        sp.mouseOverhandle15();}
    @Test
    public void testMouseOverHandle16()throws InterruptedException{
        sp.mouseOverhandle16();}
    @Test
    public void testMouseOverHandle17()throws InterruptedException{
        sp.mouseOverhandle17();}
    @Test
    public void testMouseOverHandle18()throws InterruptedException{
        sp.mouseOverhandle18();}
    @Test
    public void testMouseOverHandle19()throws InterruptedException{
        sp.mouseOverhandle19();}
    @Test
    public void testMouseOverHandle20()throws InterruptedException{
        sp.mouseOverhandle20();}
}
package testPages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SearchPage;

public class TestSearchPage extends SearchPage {
     SearchPage sP;
     @BeforeMethod
     public void getNews(){ sP= PageFactory.initElements(driver,SearchPage.class);}
     @Test
     public void testSearchOption()throws InterruptedException {
         sP.searchItems();
     }



}

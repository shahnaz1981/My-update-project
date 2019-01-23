package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;

public class PoliticalPage extends CommonAPI {
    @FindBy(linkText = "Politics")
    WebElement politics;
    @FindBy(xpath = "//a[@ href='/specials/politics/president-donald-trump-45'] ")
    WebElement firstHeaderNews45;
    @FindBy(xpath = "//a[@ href='/specials/politics/congress-capitol-hill']")
    WebElement headerLinkCongress;
    @FindBy(xpath = "//a[@ href='/specials/politics/supreme-court-nine']")
    WebElement headerLinkSupremeCourt;
    @FindBy(xpath = "//a[@ href='/election/2018/results']")
    WebElement headerLink2018ElectionResult;
    @FindBy(xpath = "//span[text()='Government shutdown negotiations appear frozen in place']")
    WebElement politicsText;

    public void searchPoliticalNews(){
        politics.click();
        firstHeaderNews45.click();
    }
    public String searchPoliticalNews1(){
        politics.click();
        headerLinkCongress.click();
        String text=politicsText.getText();
        return text; }
    public String searchTitle(){
        String text=driver.getTitle();
        return text ;}
    public void searchSupremeCourtNews(){
        politics.click();
        headerLinkSupremeCourt.click(); }
    public void search2018ElectionResultNews(){
        politics.click();
        headerLink2018ElectionResult.click();
    }
    public void searchCongressNews(){
        politics.click(); }
    public List webElements(){
        List<WebElement> webElements=new ArrayList<>();
        webElements.add(firstHeaderNews45);
        webElements.add(headerLinkCongress);
        webElements.add(headerLinkSupremeCourt);
        webElements.add(headerLink2018ElectionResult);
        List<String>list =new ArrayList<>();
        for(int i=0;i<webElements.size();i++){
            list.add(webElements.get(i).getText()); }
        System.out.println(list);
        return list; }
    public List expectedAllWebElements(){
        List<String> expectedPolicalNews =new ArrayList<>();
        expectedPolicalNews.add("45");
        expectedPolicalNews.add("CONGRESS");
        expectedPolicalNews.add("SUPREME COURT");
        expectedPolicalNews.add("2018 ELECTION RESULTS");
        return expectedPolicalNews; }
    public String SearchCurrentUrl(){
        politics.click();
        String url=driver.getCurrentUrl();
        System.out.println(url);
        return url; }



}

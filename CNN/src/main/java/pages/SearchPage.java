package pages;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchPage extends CommonAPI{
//    @FindBy(how = How.CSS, using ="#twotabsearchtextbox")
//    public static WebElement searchInputWebElement;

    @FindBy(how = How.CSS, using = "#search-button")
    public static WebElement searchButton;
    @FindBy(how = How.CSS, using = "#search-input-field")
    public static WebElement searchTextBox;

    @FindBy(how = How.CSS, using ="#submit-button")
    public static WebElement submitButtonWebElement;

    public WebElement getSubmitButtonWebElement() {
        return submitButtonWebElement;
    }

    public WebElement setSubmitButtonWebElement(WebElement searchButton) {
        return this.submitButtonWebElement = searchButton;
    }

    public void searchFor(String value){
        getSearchInputField().sendKeys(value);
    }
    public void submitSearchButton(){
        getSubmitButtonWebElement().click();
    }
    public void clearInput(){
        driver.findElement(By.className("icon icon--close")).click();
    }
    public void searchItemsAndSubmitButton()throws IOException {
        List<String> list = getItemValue();
        for(int i=0; i<list.size(); i++) {
            searchFor(list.get(i));
            submitSearchButton();

            clearInput();
        }
    }

    public WebElement getSearchInputField() {
        return searchTextBox;
    }

    public void setSearchInputField(WebElement searchInputField) {
        this.searchTextBox = searchInputField;
    }

    public void searchItems()throws InterruptedException{
        List<String> itemList = getItemValue();
        for(String st: itemList) {
            getSearchInputField().sendKeys(st, Keys.ENTER);
            getSearchInputField().clear();
        }
    }

    public List<String> getItemValue(){
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("US");
        itemsList.add("Politics");
        itemsList.add("World");
        itemsList.add("Tech");
        itemsList.add("Entertainment");
        itemsList.add("Business");
        itemsList.add("Travel");
        itemsList.add("Style");

        return itemsList;
    }
}




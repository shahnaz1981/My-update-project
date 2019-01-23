package pages;

import base.CommonAPI;
import datasource.DatabaseOperation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SearchPageForSQLDB {
    @FindBy(id = "search-button")
    WebElement searchButton;
    @FindBy(id = "search-input-field")
    WebElement searchBox;
    public void getSearchButton(){
        searchButton.click();
    }
    public WebElement getSearchBox() {
        return searchBox;
    }
    public void searchFor(String value){
        getSearchButton();
        getSearchBox().click();
        getSearchBox().sendKeys(value);
    }
    public void clearInput(){
        getSearchBox().clear();
    }
    public void searchItemsAndSubmitButton()throws Exception, IOException, SQLException, ClassNotFoundException  {
        CommonAPI.driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
        DatabaseOperation databaseOperation = new DatabaseOperation();
        List<String>list=DatabaseOperation.getItemValue();
        for(int i=0; i<list.size(); i++) {
            searchFor(list.get(i));
            System.out.println(list.get(i));
            CommonAPI.driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
            clearInput();

        }
    }

}




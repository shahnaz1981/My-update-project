package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchFeatures extends CommonAPI {
    @FindBy(id ="search-button" )
    WebElement searchButton;
    @FindBy(id="search-input-field")
    WebElement searchBox;
    public void searchMenu()throws InterruptedException{
       // TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchButton.click();
        searchBox.click();
        //clearField("search-input-field");

        typeOnElementNEnter("search-input-field","CNN");
        //clearField("search-input-field");
        clearField("//input[@class='cnn-search__input']");
        navigateBack();
        typeOnElementNEnter("search-input-field","US");
        clearField("search-input-field");
        navigateBack();
        typeOnElementNEnter("search-input-field","World");
        Thread.sleep(3000);

    }
}

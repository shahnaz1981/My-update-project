package pages;

import base.CommonAPI;
import helper.ExcelReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExcelReaderPage extends CommonAPI {
    public ExcelReaderPage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "search-button")
    WebElement searchButton;
    @FindBy(id="search-input-field")
    WebElement searchBox;
    public void searchFromExcel() throws InterruptedException {
        ExcelReader excelReader = new ExcelReader("C:\\Users\\mohamed .LAPTOP-QCE4AIJL\\IdeaProjects\\WebAutomationTasneemCNN2019\\CNN\\src\\main\\java\\excelData\\ExcelDataOfCNN.xlsx");
        int rowcount = excelReader.getRowCount(0);
        searchButton.click();
        searchBox.click();
        for (int i = 0; i < rowcount; i++) {
            String searchItems = excelReader.getData(0, i, 0);
            searchBox.sendKeys(searchItems, Keys.ENTER);
            searchBox.clear();
            Thread.sleep(500);

        }
    }

}





package signInPageObjects;

import base.CommonAPI;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static googleAPIs.GoogleSheetReader.getSheetsService;
import static org.openqa.selenium.support.How.ID;
import static org.openqa.selenium.support.How.XPATH;

public class GoogleSheetsPage extends CommonAPI {
    @FindBy(how =XPATH,using="//input[@type='text']")
    public static WebElement emailAdress;
    @FindBy(how = ID, using = "//input[@type='password']")
    public static WebElement password;
    @FindBy(xpath ="//ul[@class='atom errorMessage']")
    public static WebElement signInErrorMesage;
    //ALI_GS_TC1
    public List<List<Object>> getSpreadSheetRecords(String spreadsheetId, String range) throws IOException {
        Sheets service = getSheetsService();
        ValueRange response = service.spreadsheets().values()
                .get(spreadsheetId, range)
                .execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.size() == 0) {
            return null;
        } else {
            return values;}}
    //ALI_GS_TC1 LogIn by using Google Sheet sheet data
    public List<String> signInByInvalidIdPass(String spreadsheetId, String range) throws IOException, InterruptedException {
        List<List<Object>> col2Value = getSpreadSheetRecords(spreadsheetId, range);
        List<String> actual = new ArrayList<>();
        for (List row : col2Value) {
            sleepFor(1);
            inputValueInTextBoxByWebElement(emailAdress, row.get(1).toString());
            inputValueInTextBoxByWebElement(password, row.get(2).toString());
            sleepFor(1);
            actual.add(getTextByWebElement(signInErrorMesage));
            System.out.println(getTextByWebElement(signInErrorMesage));
            clearInputBox(emailAdress);
            clearInputBox(password);
            sleepFor(1);
        }
        return actual;
    }

    }








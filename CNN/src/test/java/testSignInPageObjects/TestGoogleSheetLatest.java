package testSignInPageObjects;
import base.CommonAPI;
import googleAPIs.GoogleSheetReader;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SigninPage;
import signInPageObjects.GoogleSheetsPage;
import signInPageObjects.LoginPageLatest;
import java.io.IOException;
import java.util.List;



public class TestGoogleSheetLatest extends CommonAPI {
    SigninPage objOfSigninPage;
    LoginPageLatest objLoginPage;
    GoogleSheetsPage objGoogleSheetsPage;
    @BeforeMethod
    public void initializationOfElements() {
        objOfSigninPage = PageFactory.initElements(driver, SigninPage.class);
        objLoginPage = PageFactory.initElements(driver, LoginPageLatest.class);
        objGoogleSheetsPage = PageFactory.initElements(driver, GoogleSheetsPage.class);
    }
    @Test
    public void invalidSigninByGoogleSheetApi() throws IOException, InterruptedException {
        String spreadsheetId = "1YXQPOZzuk0dA0cwYMEyZqcTbkfF2OaOYd9fkloh3K8I";
        String range = "CNNLogin!A2:D4";
       objOfSigninPage.signINFunctionForGoogle();
       List<List<Object>> getRecords = GoogleSheetReader.getSpreadSheetRecords(spreadsheetId, range);
        for (List cell : getRecords) {
            objLoginPage.login(cell.get(1).toString(), cell.get(2).toString());
            String expectedText = cell.get(3).toString();
            String actualText = objLoginPage.getErrorMessage();
            System.out.println(actualText);

        }
    }
}

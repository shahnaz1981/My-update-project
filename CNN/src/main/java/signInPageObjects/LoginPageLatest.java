package signInPageObjects;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import static org.openqa.selenium.support.How.ID;
import static org.openqa.selenium.support.How.XPATH;
public class LoginPageLatest extends CommonAPI {
    private WebDriver driver ;
    @FindBy(partialLinkText = "Sign In")
    public static WebElement signInButton;
    @FindBy(how = XPATH, using = "//input[@type='text']")
    public static WebElement emailAdress;
    @FindBy(how = ID, using = "//input[@type='password']")
    public static WebElement passwords;
    @FindBy(how=XPATH,using="//button[@class='atom button submit']")
    public static WebElement submitLogIn;
    @FindBy(how=XPATH,using = "//ul[@class='atom errorMessage']")
    public static WebElement ErrorMesage;
    public LoginPageLatest getLogInPageLatest() {
        signInButton.click();
        return new LoginPageLatest();
    }
    public LoginPageLatest login(String email, String password){
        TestLogger.log("Sending keys to email box");
        sendKeys(emailAdress, "Emailaddress", email);
        sendKeys(passwords,"Password", password);
        click(submitLogIn,"SignIn");
        return new LoginPageLatest();
    }
    public String getErrorMessage(){
        TestLogger.log(ErrorMesage.getText());
        String actualText = ErrorMesage.getText();
        return actualText;
    }
}




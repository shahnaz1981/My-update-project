package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class SigninPage extends CommonAPI {
    @FindBy(linkText = "Sports")
    WebElement sportLink;
    @FindBy(linkText = "Login")
    WebElement signinButton;
    @FindBy(xpath ="//button[text()='Sign in with Email']" )
    WebElement signinwithEmail;
    @FindBy(xpath = "//input[@type='text']")
    WebElement emailBox;
    @FindBy(xpath = "//input[@type='password']")
    WebElement passworwBox;
    @FindBy(xpath = "//button[@class='atom button submit']")
    WebElement submitButton;
    @FindBy(xpath = "//ul[@class='atom errorMessage']")
    WebElement findErrorMassage;
    public void signINFunctionForGoogle(){
        sportLink.click();
        signinButton.click();
        signinwithEmail.click();}
    public void signinFunction(){
        sportLink.click();
        signinButton.click();
        signinwithEmail.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        emailBox.sendKeys("tahsan gmail.com");
        passworwBox.sendKeys("abc123");
        submitButton.click();}
    public  String signinFunctionVarify(){
        String text=findErrorMassage.getText();
        return text;

     }


}

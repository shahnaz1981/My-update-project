package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends CommonAPI {
 @FindBy(linkText = "Sports")
 WebElement sportLink;
 @FindBy(linkText = "Sign Up")
 WebElement signUpLink;
 @FindBy(xpath = "//a[@ href='https://facebook.com/bleacherreport']")
 WebElement faceBookLogo;
 @FindBy(xpath = "//a[@class='_42ft _4jy0 _3obb _4jy6 _4jy2 selected _51sy']")
  WebElement createAccountButton;
 @FindBy(id = "u_0_k")
  WebElement firstNameBox;
 @FindBy(id="u_0_m")
 WebElement lastNameBox;
 @FindBy(id="u_0_p")
 WebElement emailId;
 @FindBy(id="u_0_w")
 WebElement password;
 @FindBy(id="month")
 WebElement monthOption;
 @FindBy(id="day")
 WebElement dayOption;
 @FindBy(id="year")
 WebElement yearOption;

 public void searchSignUpOption()throws InterruptedException{
     sportLink.click();
     signUpLink.click();
     faceBookLogo.click();
     createAccountButton.click();
     Thread.sleep(3000);
     firstNameBox.sendKeys("Tahsan");
     lastNameBox.sendKeys("Ekhtiar");
     emailId.sendKeys("rekhtiar@hotmail.com");
     password.sendKeys("abcd1234");
     Actions action =new Actions(driver);
     dropDown(monthOption,2);
     dropDown(dayOption,12);
     dropDown(yearOption,7);

 }



}

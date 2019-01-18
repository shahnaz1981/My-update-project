package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EntertainmentPage extends CommonAPI {
@FindBy(linkText = "Entertainment")
WebElement entertainmentLink;
@FindBy(xpath ="//a[ @class='cnn-icon'and@ href='http://facebook.com/CNNent']" )
 WebElement faceBookLogo;
public String searchLogo (){
   entertainmentLink.click();
    System.out.println("Show logo Display status :"+faceBookLogo.isDisplayed());
    String location="facebook logo location"+faceBookLogo.getLocation();
    System.out.println("facebook logo location:"+faceBookLogo.getLocation());
    return location;
}

}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Util;

public class HomePage extends BasePage {
    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = ".login")
    WebElement signIn;
    @FindBy(id ="contact-link")
    WebElement contactUs;
    @FindBy(css=".logo.img-responsive")
    WebElement logo;
    @FindBy(id="search_query_top")
    WebElement search;
    @FindBy(className="submit_search")
    WebElement clickSearch;

    public boolean isOnHomePage(){
        return Util.isDiplayed(logo);
    }
    public void navigateToAuthenticationPage(){
        Util.click(signIn);
    }
    public void navigateToContactUs(){
        Util.click(contactUs);
    }
    public void enterProduct(String product){
        Util.sendKeys(search,product);
        Util.click(clickSearch);
    }
}

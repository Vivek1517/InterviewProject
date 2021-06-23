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
    @FindBy(id="newsletter-input")
    WebElement newsLetter;
    @FindBy(name="submitNewsletter")
    WebElement clickNext;
    @FindBy(css=".alert.alert-danger")
    WebElement subscriptionErrorMessage;
    @FindBy(css= ".alert.alert-success")
    WebElement subscriptionSucessMessage;

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
    public void enterEmailForNewsletter(String email){
        Util.sendKeys(newsLetter,email);
    }
    public void clickOnNext(){
        Util.click(clickNext);
    }
    public String newsLetterErrorMessage(){
        return Util.getText(subscriptionErrorMessage);
    }
    public String newsLetterSucessMessage(){
        return Util.getText(subscriptionSucessMessage);
    }
}

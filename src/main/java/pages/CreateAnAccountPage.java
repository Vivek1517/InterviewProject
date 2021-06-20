package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Util;

public class CreateAnAccountPage extends BasePage {
    public CreateAnAccountPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(className="page-heading")
    WebElement pageHeading;
    @FindBy(css="#id_gender1")
    WebElement title;
    @FindBy(css="#customer_firstname")
    WebElement firstName;
    @FindBy(css="#customer_lastname")
    WebElement lastName;
    @FindBy(css="#passwd")
    WebElement pwd;
    @FindBy(css="#days")
    WebElement date;
    @FindBy(css="#months")
    WebElement month;
    @FindBy(css="#years")
    WebElement year;
    @FindBy(css="#newsletter")
    WebElement newsLetter;
    @FindBy(css="#optin")
    WebElement specialOffer;
    @FindBy(css="#address1")
    WebElement enterAddress;
    @FindBy(css="#city")
    WebElement enterCity;
    @FindBy(css="#id_state")
    WebElement enterState;
    @FindBy(css="#postcode")
    WebElement postCode;
    @FindBy(css="#id_country")
    WebElement selectCountry;
    @FindBy(css="#phone_mobile")
    WebElement number;
    @FindBy(css="#submitAccount")
    WebElement register;
    @FindBy(xpath="//div[@class='alert alert-danger']/ol/li")
    WebElement validationMessage;
    @FindBy(xpath="//div[@id=\'center_column\']/p[@class=\'info-account\']")
    WebElement myAccountValidationMessage;


    public boolean onCreateAccountPage(){

        return Util.isDiplayed(pageHeading);
    }
    public void selectTitle(String gender, String fName, String lName, String password){
        if(gender.equalsIgnoreCase("Mr")){
            Util.waitTime(2);
            Util.click(title);
        }
        else{
            Util.click(title);
        }
        Util.sendKeys(firstName,fName);
        Util.sendKeys(lastName,lName);
        Util.sendKeys(pwd,password);
    }
    public void selectDOB(String days, String months, String years){
        Util.waitTime(2);
        Util.selectByValue(date,days);
        Util.selectByValue(month,months);
        Util.selectByValue(year, years);
        Util.click(newsLetter);
        Util.click(specialOffer);
    }
    public void enterAddress(String address, String city, String state, String pc){
        Util.sendKeys(enterAddress, address);
        Util.sendKeys(enterCity, city);
        Util.waitTime(2);
        Util.selectByValue(enterState, state);
        Util.sendKeys(postCode, pc);
    }
    public void selectCountry(String country){
        Util.selectByText(selectCountry, country);
    }
    public void enterNumber(String mNumber){
        Util.sendKeys(number,mNumber);
    }
    public void clickRegister(){
        Util.click(register);
    }

    public String errorMessage(){
        return Util.getText(validationMessage);
    }

    public boolean myAccountMessage(){
        return Util.isDiplayed(myAccountValidationMessage);
    }
}

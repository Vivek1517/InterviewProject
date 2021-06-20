package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Util;

public class AuthenticationPage extends BasePage{
    public AuthenticationPage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy (id="create-account_form")
    WebElement accountForm;
    @FindBy (css="#email_create")
    WebElement inputEmail;
    @FindBy (css="#SubmitCreate")
    WebElement clickCreateAccount;
    @FindBy(id="login_form")
    WebElement logInForm;
    @FindBy(css="#email")
    WebElement userName;
    @FindBy(css="#passwd")
    WebElement pwd;
    @FindBy(id="SubmitLogin")
    WebElement clickOnSignIn;
    @FindBy(xpath="//div[@id=\'center_column\']/p[@class=\'info-account\']")
    WebElement myAccountValidationMessage;
    @FindBy(xpath="//div[@class='alert alert-danger']/ol/li")
    WebElement errorMessage;

    public boolean isUSerOnAuthenticationPage(){
        return Util.isDiplayed(accountForm);
    }
    public void enterEmailID(String email){
        Util.sendKeys(inputEmail,email);
        Util.click(clickCreateAccount);
    }
    public boolean isUserOnLogInPage(){
        return Util.isDiplayed(logInForm);
    }
    public void enterUserNamePWD(String text, String password){
        Util.sendKeys(userName,text);
        Util.sendKeys(pwd,password);
        Util.click(clickOnSignIn);
    }

    public boolean isOnAccountPage(){
        return Util.isDiplayed(myAccountValidationMessage);
    }
    public String validationMessage(){
        return Util.getText(errorMessage);
    }
}

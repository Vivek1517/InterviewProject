package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;

import java.util.concurrent.TimeUnit;

public class Util extends BasePage {
    public static void click(WebElement element){
        element.click();
    }
    public static void sendKeys(WebElement element, String text){
        element.sendKeys(text);
    }
    public static void waitTime(long seconds){
        driver.manage().timeouts().implicitlyWait(seconds,TimeUnit.SECONDS);
    }
    public static void selectByIndex(WebElement element, int index){
        Select select = new Select(element);
        select.selectByIndex(index);
    }
    public static void selectByText(WebElement element, String text){
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }
    public static void selectByValue(WebElement element, String value){
        Select select = new Select(element);
        select.selectByValue(value);
    }
    public static void action(WebElement element){
        Actions action = new Actions(driver);
        action.moveToElement(element);
    }
    public static boolean isDiplayed(WebElement element){
        return element.isDisplayed();
    }
    public static  boolean containText(WebElement element, String text){
        return element.getText().contains(text);
    }
    public static String getText(WebElement element){
        return element.getText();
    }
}

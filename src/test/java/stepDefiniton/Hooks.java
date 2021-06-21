package stepDefiniton;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import pages.BasePage;

public class Hooks extends BasePage {
    @Before
    public void startBrowser(){
        openBrowser(browserType);
    }
    @After
    public void quitBrowser(){
    quit();
    }
}

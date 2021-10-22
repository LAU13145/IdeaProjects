package test_cases;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;


public class HomeTest extends TestBase{
    @Test
    public void init() throws Exception {
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.sign_up();
    }
}

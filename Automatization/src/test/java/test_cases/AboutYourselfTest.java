package test_cases;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pages.AboutYourselfPage;


public class AboutYourselfTest extends TestBase{
    @Before
    public void setData() throws Exception {
        HomeTest homeTest = new HomeTest();
        homeTest.init();
    }

    @Test
    public void init() throws Exception {
        AboutYourselfPage aboutYourself = PageFactory.initElements(driver, AboutYourselfPage.class);
        aboutYourself.setFirstName("Juana");
        aboutYourself.setLastName("Ferreri");
        aboutYourself.setEmail("psm@dea.com");
        aboutYourself.setBirthDate("23", "February", "1987");
        aboutYourself.goAddressPage();
    }
}
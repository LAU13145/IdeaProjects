package test_cases;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pages.AddressPage;


public class AddressTest extends TestBase {
    @Before
    public void setData() throws Exception {
        AboutYourselfTest aboutTest = new AboutYourselfTest();
        aboutTest.setData();
        aboutTest.init();
    }

    @Test
    public void init() throws Exception {
        AddressPage address = PageFactory.initElements(driver, AddressPage.class);
        address.setCity("Bogotá");
        address.setZip("110456");
        address.setCountryName("Colombia");
        address.goDevicePage();
    }
}
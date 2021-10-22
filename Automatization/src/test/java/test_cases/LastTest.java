package test_cases;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pages.LastPage;


public class LastTest extends TestBase {
    @Before
    public void setData() throws Exception {
        DevicesTest devicesTest = new DevicesTest();
        devicesTest.setData();
        devicesTest.init();
    }

    @Test
    public void init() throws Exception {
        LastPage last = PageFactory.initElements(driver, LastPage.class);
        last.setPassword("r-dcM4!4SSQniAA");
        last.setInformed();
        last.setTerms();
        last.setPrivacy();
        last.submit();
    }

}
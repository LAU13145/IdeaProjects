package test_cases;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pages.DevicesPage;


public class DevicesTest extends TestBase {

    @Before
    public void setData() throws Exception {
        AddressTest addressTest = new AddressTest();
        addressTest.setData();
        addressTest.init();
    }


    @Test
    public void init() throws Exception {
        DevicesPage devices = PageFactory.initElements(driver, DevicesPage.class);
        devices.setComputerName("Linux");
        devices.setVersionName("CentOS");
        devices.setLanguageName("Spanish");
        devices.setMobileName("Apple");
        devices.setModelName("iPhone 13");
        devices.setOSName("iOS 15");
        devices.goLastPage();
    }
}
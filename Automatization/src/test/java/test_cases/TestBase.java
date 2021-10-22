package test_cases;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver = null;

    @Before
    public void initialize(){
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.utest.com/");
    }

    @After
    public void closeDriver() {
        TestBase.driver.quit();
        System.out.println("End test");
    }
}

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class OpenPage {
    WebDriver chromeDriver;

    @Before
    public void openDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void startBrowser() throws InterruptedException {

        chromeDriver.get("https://www.utest.com/");
        WebElement btnLogin = chromeDriver.findElement(By.className("unauthenticated-nav-bar__sign-up"));
        btnLogin.click();
        Thread.sleep(2000);
        WebElement txtUser = chromeDriver.findElement(By.id("firstName"));
        txtUser.sendKeys("Paula");
        WebElement txtLastName = chromeDriver.findElement(By.id("lastName"));
        txtLastName.sendKeys("Rodriguez");
        WebElement txtEmail = chromeDriver.findElement(By.id("email"));
        txtEmail.sendKeys("pau1314@gmail.com");
        WebElement cmbMonth = chromeDriver.findElement(By.id("birthMonth"));
        cmbMonth.sendKeys("August");
        WebElement cmbDay = chromeDriver.findElement(By.id("birthDay"));
        cmbDay.sendKeys("23");
        WebElement cmbYear = chromeDriver.findElement(By.id("birthYear"));
        cmbYear.sendKeys("1985");

        WebElement btnNextLocation = chromeDriver.findElement(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
        btnNextLocation.click();

        WebElement txtCity = chromeDriver.findElement(By.id("city"));
        txtCity.sendKeys("Bogotá");
        WebElement txtZip = chromeDriver.findElement(By.id("zip"));
        txtZip.sendKeys("110421");
        WebElement cmbCountry = chromeDriver.findElement(By.className("form-control ui-select-search ng-pristine ng-valid ng-empty ng-touched"));
        cmbCountry.sendKeys("Colombia");

    }

    @After
    public void closeDriver(){
        chromeDriver.quit();
        System.out.println("End test");
    }

}

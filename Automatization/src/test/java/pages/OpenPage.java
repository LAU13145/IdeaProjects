package pages;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



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
        txtEmail.sendKeys("pauLA89@gmail.com");
        WebElement cmbMonth = chromeDriver.findElement(By.id("birthMonth"));
        cmbMonth.sendKeys("August");
        WebElement cmbDay = chromeDriver.findElement(By.id("birthDay"));
        cmbDay.sendKeys("23");
        WebElement cmbYear = chromeDriver.findElement(By.id("birthYear"));
        cmbYear.sendKeys("1985");

        WebElement btnNextLocation = chromeDriver.findElement(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
        btnNextLocation.click();
        Thread.sleep(4000);
        WebElement txtCity = chromeDriver.findElement(By.id("city"));
        txtCity.clear();
        txtCity.sendKeys("Bogotá");
        WebElement txtZip = chromeDriver.findElement(By.id("zip"));
        txtZip.clear();
        txtZip.sendKeys("110421");
        Thread.sleep(10);

        WebElement cmbCountry = chromeDriver.findElement(By.xpath("//*[@name=\"countryId\"]"));
        cmbCountry.click();
        WebElement inputCountry = chromeDriver.findElement(By.xpath("//*[@name=\"countryId\"]/input[1]"));
        inputCountry.sendKeys("Colombia");
        Thread.sleep(3000);

        WebElement btnNextDevices = chromeDriver.findElement(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
        btnNextDevices.click();

        WebElement cmbYourComputer = chromeDriver.findElement(By.xpath("//*[@name=\"osId\"]"));
        cmbYourComputer.click();
        WebElement inputYourComputer = chromeDriver.findElement(By.xpath("//*[@name=\"osId\"]/input[1]"));
        inputYourComputer.sendKeys("Linux");


        WebElement cmbVersion = chromeDriver.findElement(By.xpath("//*//*[@name=\"osVersionId\"]"));
        cmbVersion.click();
        WebElement inputVersion = chromeDriver.findElement(By.xpath("//*//*[@name=\"osVersionId\"]/input[1]"));
        inputVersion.sendKeys("CentOS");
        Thread.sleep(10);

        WebElement cmbLanguage = chromeDriver.findElement(By.xpath("//*[@name=\"osLanguageId\"]"));
        cmbLanguage.click();
        WebElement inputLanguage = chromeDriver.findElement(By.xpath("//*[@name=\"osLanguageId\"]/input[1]"));
        inputLanguage.sendKeys("Spanish");
        Thread.sleep(10);

        WebElement cmbYourMobile = chromeDriver.findElement(By.xpath("//*[@name=\"handsetMakerId\"]"));
        cmbYourMobile.click();
        WebElement inputYourMobile = chromeDriver.findElement(By.xpath("//*[@name=\"handsetMakerId\"]/input[1]"));
        inputYourMobile.sendKeys("Apple");
        inputYourMobile.sendKeys(Keys.RETURN);
        Thread.sleep(10);

        WebElement cmbModel = chromeDriver.findElement(By.xpath("//*[@name=\"handsetModelId\"]"));
        cmbModel.click();
        Thread.sleep(10);
        WebElement inputModel = chromeDriver.findElement(By.xpath("//*[@name=\"handsetModelId\"]/input[1]"));
        inputModel.sendKeys("iPhone 13");
        inputModel.sendKeys(Keys.RETURN);
        Thread.sleep(10);


        WebElement cmbOS = chromeDriver.findElement(By.xpath("//*[@name=\"handsetOSId\"]"));
        cmbOS.click();
        WebElement inputOS = chromeDriver.findElement(By.xpath("//*[@name=\"handsetOSId\"]/input[1]"));
        inputOS.sendKeys("iOS 15");
        inputOS.sendKeys(Keys.RETURN);
        Thread.sleep(10);

        WebElement btnLastStep = chromeDriver.findElement(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));
        btnLastStep.click();

        WebElement txtPassword = chromeDriver.findElement(By.id("password"));
        txtPassword.sendKeys("r-dcM4!4SSQniAA");
        WebElement txtConfPassword = chromeDriver.findElement(By.id("confirmPassword"));
        txtConfPassword.sendKeys("r-dcM4!4SSQniAA");

        WebElement checkBoxInformed = chromeDriver.findElement(By.name("newsletterOptIn"));
        checkBoxInformed.click();

        WebElement checkBoxTerms = chromeDriver.findElement(By.name("termOfUse"));
        checkBoxTerms.click();

        WebElement checkBoxPrivacy = chromeDriver.findElement(By.name("privacySetting"));
        checkBoxPrivacy.click();

        WebElement btnComplete = chromeDriver.findElement(By.xpath("//*[@id=\"laddaBtn\"]"));
        btnComplete.click();
        Thread.sleep(6000);
    }

    @After
    public void closeDriver()
    {
        chromeDriver.quit();
        System.out.println("End test");
    }
}
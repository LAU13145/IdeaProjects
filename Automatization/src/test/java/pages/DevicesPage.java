package pages;

import org.openqa.selenium.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DevicesPage {
    WebDriver webDriver;

    By computer = By.name("osId");
    By computerName = By.xpath("//*[@name=\"osId\"]/input[1]");
    By version = By.name("osVersionId");
    By versionName = By.xpath("//*//*[@name=\"osVersionId\"]/input[1]");
    By language = By.name("osLanguageId");
    By languageName = By.xpath("//*[@name=\"osLanguageId\"]/input[1]");
    By mobile = By.name ("handsetMakerId");
    By mobileName = By.xpath("//*[@name=\"handsetMakerId\"]/input[1]");
    By model = By.name("handsetModelId");
    By modelName = By.xpath("//*[@name=\"handsetModelId\"]/input[1]");
    By OS = By.name("handsetOSId");
    By OSName = By.xpath("//*[@name=\"handsetOSId\"]/input[1]");
    By lastPage = By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a");


    public DevicesPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }


    private void openComputerPicker (){ webDriver.findElement(computer).click(); }

    public void setComputerName(String computer_name){
        openComputerPicker();
        webDriver.findElement(computerName).sendKeys(computer_name);
    }

    private void openVersionPicker (){ webDriver.findElement(version).click(); }

    public void setVersionName(String version_name){
        openVersionPicker();
        webDriver.findElement(versionName).sendKeys(version_name);
    }

    private void openLanguagePicker (){ webDriver.findElement(language).click(); }

    public void setLanguageName(String language_name){
        openLanguagePicker();
        webDriver.findElement(languageName).sendKeys(language_name);
    }

    private void openMobilePicker (){ webDriver.findElement(mobile).click(); }

    public void setMobileName(String mobile_name){
        openMobilePicker();
        webDriver.findElement(mobileName).sendKeys(mobile_name);
        webDriver.findElement(mobileName).sendKeys(Keys.RETURN);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
    }

    private void openModelPicker (){ webDriver.findElement(model).click(); }

    public void setModelName(String model_name){
        openModelPicker();
        webDriver.findElement(modelName).sendKeys(model_name);
        webDriver.findElement(modelName).sendKeys(Keys.RETURN);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
    }

    private void openOSPicker (){ webDriver.findElement(OS).click(); }

    public void setOSName(String OS_name){
        openOSPicker();
        webDriver.findElement(OSName).sendKeys(OS_name);
        webDriver.findElement(OSName).sendKeys(Keys.RETURN);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
    }

    public void goLastPage(){
        webDriver.findElement(lastPage).click();
    }

}

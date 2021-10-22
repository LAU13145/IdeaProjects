package pages;

import org.openqa.selenium.*;

public class AddressPage {
    WebDriver webDriver;

    By city = By.id("city");
    By zip = By.id("zip");
    By country = By.name("countryId");
    By countryName = By.xpath("//*[@name=\"countryId\"]/input[1]");
    By devicePage =  By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a");


    public AddressPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }

   public void setCity(String city_name){
        WebElement element = webDriver.findElement(city);
        element.clear();
        element.sendKeys(city_name);
    }

   public void setZip (String zip_code){
        WebElement element = webDriver.findElement(zip);
        element.clear();
        element.sendKeys(zip_code);
    }

    private void openCountryPicker(){
        webDriver.findElement(country).click();
    }

    public void setCountryName(String country_name){
        openCountryPicker();
        webDriver.findElement(countryName).sendKeys(country_name);
    }

    public void goDevicePage(){
        webDriver.findElement(devicePage).click();
    }
}




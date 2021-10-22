package pages;

import org.openqa.selenium.*;

public class AboutYourselfPage {

    WebDriver webDriver;
    By firstName = By.id("firstName");
    By lastName = By.id("lastName");
    By email = By.id("email");
    By birthMonth = By.id("birthMonth");
    By birthDay = By.id("birthDay");
    By birthYear = By.id("birthYear");
    By addressPage = By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a");

    public AboutYourselfPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public void setFirstName(String first_name){
        webDriver.findElement(firstName).sendKeys(first_name);
    }

    public void setLastName(String last_name){
        webDriver.findElement(lastName).sendKeys(last_name);
    }
    public void setEmail(String input_email){
        webDriver.findElement(email).sendKeys(input_email);
    }
    private void setBirthMonth(String month){
        webDriver.findElement(birthMonth).sendKeys(month);
    }
    private void setBirthDay(String day){
        webDriver.findElement(birthDay).sendKeys(day);
    }
    private void setBirthYear(String year){
        webDriver.findElement(birthYear).sendKeys(year);
    }

    public void setBirthDate(String day, String month, String year){
        setBirthDay(day);
        setBirthMonth(month);
        setBirthYear(year);
    }

    public void goAddressPage(){
        webDriver.findElement(addressPage).click();
    }
}

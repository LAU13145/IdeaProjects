package pages;

import org.openqa.selenium.*;

public class LastPage {
    WebDriver webDriver;

    By password = By.id("password");
    By confirmPassword = By.id("confirmPassword");
    By Informed = By.name("newsletterOptIn");
    By terms = By.name("termOfUse");
    By privacy = By.name("privacySetting");
    By submit = By.xpath("//*[@id=\"laddaBtn\"]");

    public LastPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public void setPassword(String password_name){
        webDriver.findElement(password).sendKeys((password_name));
        setConfirmPassword(password_name);
    }

    private void setConfirmPassword(String confirm_password){
        webDriver.findElement(confirmPassword).sendKeys(confirm_password);
    }

    public void setInformed(){
        webDriver.findElement(Informed).click();
    }

    public void setTerms(){
        webDriver.findElement(terms).click();
    }

    public void setPrivacy(){
        webDriver.findElement(privacy).click();
    }


    public void submit(){
        webDriver.findElement(submit).click();
    }


}

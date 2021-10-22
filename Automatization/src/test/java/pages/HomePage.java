package pages;

import org.openqa.selenium.*;


public class HomePage {

    WebDriver webDriver;

    By signUp = By.className("unauthenticated-nav-bar__sign-up");

    public HomePage(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public void sign_up(){
        WebElement element = webDriver.findElement(signUp);
        element.click();
    }
}

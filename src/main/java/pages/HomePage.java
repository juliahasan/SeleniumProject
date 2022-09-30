package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static browser.Browser.getPropertyValue;

public class HomePage {

@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")private WebElement userNameElement;
@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")private WebElement passwordElement;
@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")private WebElement loginButton;

public void login(){
    userNameElement.sendKeys(getPropertyValue("userName"));
    passwordElement.sendKeys(getPropertyValue("password"));
    loginButton.click();
}
}




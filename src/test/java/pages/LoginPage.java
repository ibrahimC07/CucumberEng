package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@id='formBasicEmail']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='formBasicPassword']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[text()='invalid credentials']")
    public WebElement invalidCredentialsError;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement errorMessage;

    @FindBy(xpath = "//*[@name='car']")
    public WebElement selectACar;
}
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaHomePage {
    public MedunnaHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath="//a[@aria-haspopup='true']")
    public WebElement signInIcon;

    @FindBy(xpath="(//a[@class='dropdown-item'])[1]")
    public WebElement signInButton;

    @FindBy(xpath="//input[@name='username']")
    public WebElement username;

    @FindBy(xpath="//input[@name='password']")
    public WebElement password;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement submit;
}

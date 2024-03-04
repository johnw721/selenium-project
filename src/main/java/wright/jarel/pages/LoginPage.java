package wright.jarel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import.org.openqa.selenium.WebElement;


public class LoginPage {

    @CacheLookup
    @FindBy(id = "username")
    private WebElement usernameField;

    @CacheLookup
    @FindBy(id = "password")
    private WebElement userPassword;

    @CacheLookup
    @FindBy(id = "btnLogin")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {

        PageFactory.initElements(driver, this);

}

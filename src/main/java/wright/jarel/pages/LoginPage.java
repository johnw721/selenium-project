package wright.jarel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import.org.openqa.selenium.WebElement;


public class LoginPage extends BasePage {

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
        super(driver);

        PageFactory.initElements(driver, this);

        }

    public void login(String username, String password){

        elementControl.setText(userId, username);

        elementControl.setText(userPassword, password);

        elementControl.clickElement(loginButton);

    }

}

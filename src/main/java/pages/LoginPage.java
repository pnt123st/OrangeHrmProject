package pages;

import browser.Info;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {


    @FindBy(css = "input[name='username']") private WebElement userName;
    @FindBy(css = "input[name='password']") private WebElement password;
    @FindBy(className = "orangehrm-login-button") private WebElement loginButton;


    public void loginToOHRM(){
        userName.sendKeys(Info.USER_NAME);
        password.sendKeys(Info.PASSWORD);
        loginButton.click();
    }
}

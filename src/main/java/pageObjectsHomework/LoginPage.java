package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public WebDriver chromedriver;

    public LoginPage(WebDriver driver) {

        this.chromedriver = driver;
    }
    private By usernameInputField = By.id("user-name");
    private By passwordInputField = By.id("password");
    private By loginButton = By.cssSelector("input#login-button");



    public void login(String username,String password){
        getUsernameField().sendKeys(username);
        getPasswordField().sendKeys(password);
        getLoginButton().click();
    }

    public WebElement getUsernameField(){

        return chromedriver.findElement(usernameInputField);
    }
    public WebElement getPasswordField(){

        return chromedriver.findElement(passwordInputField);
    }

    public WebElement getLoginButton(){

        return chromedriver.findElement(loginButton);
    }



}

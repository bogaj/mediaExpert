package pl.pb.mediaexpert.pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage extends BasePage {
   SelenideElement emailField = $x("(//input[@type='email'])[1]");
   SelenideElement passwordField = $x("//input[@type='password']");
  SelenideElement loginButton =  $x("//span[contains(text(),'Zaloguj się')]");

  private String loginPageUrl = "https://www.mediaexpert.pl/login";

  public LoginPage goToLoginPage(){
      open(loginPageUrl);
      return this;
  }
public LoginPage typeUserEmailInField(String userEmail){
    emailField.clear();
    emailField.sendKeys(userEmail);
    return this;
}
public LoginPage typePasswordInField(String password){
    passwordField.clear();
    passwordField.sendKeys(password);
    return this;
}
public LoginPage clickOnLoginButton(){
    loginButton.click();
    return this;
}
}

package pl.pb.mediaexpert.tests;

import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;
import pl.pb.mediaexpert.pageObjects.LoginPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class IncorrectLoginTest extends TestBase {

    @Test
    public void asUserTryToLoginWithIncorrectEmailAndPassword(){
        LoginPage loginPage = new LoginPage();
        loginPage
                .goToLoginPage()
                .closeCookies();
        loginPage.typeUserEmailInField("incorrectEmail@op.pl")
                .typePasswordInField("wrongPassword")
                .clickOnLoginButton();
        SelenideElement msgAfterIncorrectLogin = $x("//div[@class='alert-content']");
        msgAfterIncorrectLogin.shouldHave(text("Nieprawidłowa nazwa użytkownika lub hasło."));
    }


}

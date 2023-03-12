package pl.pb.mediaexpert.tests;

import org.testng.annotations.Test;
import pl.pb.mediaexpert.manager.SaveCookies;
import pl.pb.mediaexpert.pageObjects.LoginPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class CorrectLoginTest extends TestBase {


    @Test
    public void asUserLoginUsingValidLoginAndPassword() {
        LoginPage loginPage = new LoginPage();
        loginPage
                .goToLoginPage()
           .closeCookies();
        loginPage.typeUserEmailInField("otua.tamotua@op.pl")
                .typePasswordInField("TestyME123$")
                .clickOnLoginButton();

        SaveCookies.save();
        $x("//h3[normalize-space()='Witaj Otua Tamotua']").shouldBe(visible);


    }
}
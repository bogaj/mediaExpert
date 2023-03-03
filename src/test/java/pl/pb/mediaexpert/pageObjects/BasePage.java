package pl.pb.mediaexpert.pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class BasePage {
    SelenideElement cookiesCloseButton = $x("(//span[contains(text(),'Zamknij')])[1]");

public void closeCookies(){
    cookiesCloseButton.click();
}
}

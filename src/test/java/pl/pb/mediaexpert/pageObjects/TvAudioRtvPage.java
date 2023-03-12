package pl.pb.mediaexpert.pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class TvAudioRtvPage extends BasePage{
    SelenideElement allTvButton = $x("//p[normalize-space()='Wszystkie telewizory']");

    private String tvAudioPageUrl = "https://www.mediaexpert.pl/telewizory-i-rtv";

    public AllTvPage clickOnAllTvButton(){
allTvButton.click();
return new AllTvPage();
    }
}

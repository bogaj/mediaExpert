package pl.pb.mediaexpert.pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage extends BasePage {
SelenideElement tvAudioRtvTab = $x("//span[@class='item-name'][normalize-space()='TV, Audio i RTV']");

public TvAudioRtvPage clickOnTvAudioRtvTab(){
    tvAudioRtvTab.click();
    return new TvAudioRtvPage();
}
}

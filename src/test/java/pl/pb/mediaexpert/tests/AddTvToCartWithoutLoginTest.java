package pl.pb.mediaexpert.tests;

import org.testng.annotations.Test;
import pl.pb.mediaexpert.manager.SaveCookies;
import pl.pb.mediaexpert.pageObjects.MainPage;

import static com.codeborne.selenide.Selenide.open;


public class AddTvToCartWithoutLoginTest extends TestBase{

    @Test
    public void addTCLtvToCart (){

        open("https://www.mediaexpert.pl");
        SaveCookies.load();

        MainPage mainPage = new MainPage();
        mainPage.clickOnTvAudioRtvTab()
                .clickOnAllTvButton();


    }

    private void sleep(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }}

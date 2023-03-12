
package pl.pb.mediaexpert.configuration;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
public class PopUpBlocker {
    public static void configureOptions(String browserName) {

        if (browserName.equals("CHROME")) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--disable-notifications");
            Configuration.browserCapabilities = chromeOptions;
        } else if (browserName.equals("FIREFOX")) {
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.addPreference("dom.popup_maximum", 0);
            Configuration.browserCapabilities = firefoxOptions;
        } else if (browserName.equals("EDGE")) {
            EdgeOptions edgeOptions = new EdgeOptions();
            edgeOptions.addArguments("--enable-popup-blocking");
            Configuration.browserCapabilities = edgeOptions;
        }

    }
    public static void jsBlock(){
        // blokowanie okien modalnych za pomocą JavaScriptu
        JavascriptExecutor js = (JavascriptExecutor) WebDriverRunner.getWebDriver();
        js.executeScript("window.alert = function() {}; window.confirm = function() {}; window.prompt = function() {};");

    }

 /*   public static void main(String[] args) {
        // wybór przeglądarki
        Configuration.browser = "EDGE";

        // ustawienie opcji przeglądarki w Selenide
        configureOptions(Configuration.browser);
    }*/
}

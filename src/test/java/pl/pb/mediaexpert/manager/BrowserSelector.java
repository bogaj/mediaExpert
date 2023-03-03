/*
package pl.pb.mediaexpert.manager;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSelector {
    public static void selectBrowser(String browserName) throws IllegalStateException {
        WebDriver driver;

        switch (browserName) {
            case "FIREFOX":
                driver = new FirefoxDriver();
                break;
            case "EDGE":
                driver = new EdgeDriver();
                break;
            case "CHROME":
                driver = new ChromeDriver();
                break;
            default:
                throw new IllegalStateException("Unsupported browser: " + browserName);
        }

        WebDriverRunner.setWebDriver(driver);
        Configuration.browser = browserName;
    }
}
*/
